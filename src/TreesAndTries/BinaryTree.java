package TreesAndTries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
  
  public static int minDepth,maxDepth;
  static ArrayList<Integer> list = new ArrayList<Integer>();
  static int[] input={1,2,3,4,5,6,7};
  public static void main(String[] args){
    //DFS Algorithm. PreOrder traversal are same.
    Node n1 = new Node(1);
    Node n2= new Node(2);
    Node n3= new Node(3);
    Node n4= new Node(4);
    Node n5= new Node(5);
    Node n6= new Node(6);
    Node n7= new Node(7);
    Node n8= new Node(8);
    Node n9= new Node(9);
    
    Node n11 = new Node(1);
    Node n12= new Node(2);
    Node n13= new Node(3);
    Node n14= new Node(4);
    Node n15= new Node(5);
    Node n16= new Node(6);
    Node n17= new Node(7);
    
    n1.left=n2;
    n1.right=n3;
    n2.left=n4;
    n2.right=n5;
    n3.left=n6;
    n3.right=n7;
    n7.left=n8;
    n8.right=n9;
    
    n11.left=n12;
    n11.right=n13;
    n12.left=n14;
    n12.right=n15;
    n13.left=n16;
    n13.right=n17;
    // printLevelByLevelDriver(n1);
    // int find_max=findMax(n1);
    // System.out.println(find_max);
    // printLevelByLevelAlternate(n1);
    // maxBreadthDriver(n1);
    // int leaves=countLeaves(n1);
    // System.out.println(leaves);
    // sumOfNodesInPathEqualK(n1,3);
    // Node lca=LowestCommonAncestor(n1,2,4);
    // System.out.println(lca.data);
    // boolean result=isIdentical(n1, n11);
    // System.out.println(result);
    // boolean result=isSubTree(n1, n13);
    // System.out.println(result);
    // mirror(n1);
    // inOrder(n1);
    // int result=diameter(n1);
    // System.out.println(result);
    // boolean result=isHeightBalanced(n1);
    // System.out.println(result);
    // Node root=minimalHeightTree(input,0,input.length-1);
    // inOrder(root);
    // System.out.println(findMin(n1));
    boolean result=isBinaryTreeBST(n1);
    System.out.println(result);
  }
  
  //Useful for prefix expressions
  public static void preOrder(Node root){
    if(root==null){
        return;
    }
    System.out.println(root.getData());
    preOrder(root.left);
    preOrder(root.right);
  }
  
  public static void inOrder(Node root){
    if(root==null){
      return;
    }
    inOrder(root.left);
    System.out.println(root.getData());
    inOrder(root.right);
  }
  
  
  public static void postOrder(Node root){
    if(root==null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.getData());
  }
  
  public static int findMax(Node root){
    if(root==null){
      return Integer.MIN_VALUE;
    }
    int result=root.data;
    int left=findMax(root.left);
    int right=findMax(root.right);
    
    if(left>result){
      result=left;
    }
    if(right>result){
      result=right;
    }
    return result;
  }
  
  public static int findMin(Node root){
    if(root==null){
      return Integer.MAX_VALUE;
    }
    int left=findMin(root.left);
    int right=findMin(root.right);
    
    return Math.min(root.data, Math.min(left, right));
  }

  public static int height(Node root){
    if(root==null){
      return 0;
    }
    int left=height(root.left);
    int right=height(root.right);
    
    return 1+Math.max(left,right);
  }
  
  public static void printLevelByLevelDriver(Node root){
    for(int i=1;i<=height(root);i++){
      printLevelByLevel(root,i);
      System.out.println("");
    }
  }
  
  public static void printLevelByLevel(Node root,int level){
     if(level==1){
       System.out.print(root.getData()+" ");
       return ;
     }
     printLevelByLevel(root.left,level-1);
     printLevelByLevel(root.right,level-1);
  }
  
  public static void printLevelByLevelAlternate(Node root){
    Queue<Node> queue= new LinkedList<Node>();
    queue.add(root);
    
    while(!queue.isEmpty()){
      Node current=queue.poll();
      System.out.println(current.data);
      
      if(current.left!=null){
        queue.add(current.left);
      }
      if(current.right!=null){
        queue.add(current.right);
      }
    }
  }
  
  public static void maxBreadthDriver(Node root){
    maxBreadth(root,0,0,0);
    for(int i=minDepth;i<=maxDepth;i++){
      verticalOrderTraversal(root,i);
    }
  } 
  
  public static void maxBreadth(Node root,int min,int max,int hd){
    if(root==null){
      return ;
    }
    if(hd<min){
      minDepth=hd;
    }
    if(hd>max){
      maxDepth=hd;
    }
    maxBreadth(root.left,minDepth,maxDepth,hd-1);
    maxBreadth(root.right,minDepth,maxDepth,hd+1);
  }
  
  public static void verticalOrderTraversal(Node root,int depth){
    if(root==null){
      return ;
    }
    if(depth==0){
      System.out.println(root.data+" ");
    }
    verticalOrderTraversal(root.left,depth+1);
    verticalOrderTraversal(root.right,depth-1);
  }
  
  public static int countLeaves(Node root){
     if(root==null){
       return 0;
     }
     if(root.left==null && root.right==null){
       return 1;
     }
     int left=countLeaves(root.left);
     int right=countLeaves(root.right);
     
     return left+right;
  }
  
  public static void sumOfNodesInPathEqualK(Node root, int k){
    if(root==null){
      return ;
    }
    list.add(root.data);
    sumOfNodesInPathEqualK(root.left,k);
    sumOfNodesInPathEqualK(root.right,k);
    
    // Check if there is any k sum path that terminates at this node
    int sum =0;
    for(int i=list.size()-1;i>=0;i--){
         sum=sum+list.get(i);
         if(sum==k){
           printList(i);
         }
    }
    list.remove(list.size()-1); //Remove this node from the path while backtracking
  }
  
  public static void printList(int index){
    for(;index<list.size();index++){
      System.out.print(list.get(index)+" "); 
    }
    System.out.println();
  }
  
  /*
   * Another way to find LCA is to traverse through the tree and find node1. Store the path in an array list
   * Similarly do the same for node2
   * Traverse through both the array lists and find the node where mismatch occurs. 
   * The last node before mismatch is LCA
  */
  public static Node LowestCommonAncestor(Node root,int node1,int node2){
    if(root==null){
      return null;
    }
    if(root.data==node1||root.data==node2){
      return root;
    }
    
    Node left= LowestCommonAncestor(root.left, node1, node2);
    Node right= LowestCommonAncestor(root.right, node1, node2);
    
    if(left!=null && right!=null){
      return root;
    }
    return left!=null?left:right;
  }
  
  public static boolean isIdentical(Node n1,Node n11){
    if(n1==null && n11==null){
      return true;
    }
    if((n1==null&& n11!=null) || (n1!=null&& n11==null) || n1.data!=n11.data){
      return false;
    }
    boolean left=isIdentical(n1.left, n11.left);
    boolean right=isIdentical(n1.right, n11.right);
    
    return left && right;
  }
  
  /*
   * One more method is to get head of S in T and check at that moment whether S is identical to T
  */
  public static boolean isSubTree(Node T,Node S){
    if(S==null){
      return true;
    }
    if(T==null){
      return false;
    }
    if(isIdentical(T,S)){
      return true;
    }
    
    boolean left=isSubTree(T.left, S);
    boolean right=isSubTree(T.right,S);
    
    return left||right;
  }
  
  public static Node mirror(Node root){
    if(root==null){
      return null;
    }
    Node left=mirror(root.left);
    Node right=mirror(root.right);
    root.left=right;
    root.right=left;
    
    return root;
  }
  
  public static void zigzagOrSpiralTraversal(Node root){
    /*
     * Like level order traversal, stores all the nodes in a particular level in a list
     * Have a toggle and flip the toggle every time to print nodes either from left to right or vice versa  
    */
  }
  
  public static int diameter(Node root){
    /*
     * Diameter can be only with the left where it doesn't cross the current node
     * Or it can be only in the right
     * Or it passes through the node which case maximum diameter would be 1+leftHeight+rightHeight 
    */
    if(root==null){
      return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);
    
    int leftDiameter=diameter(root.left);
    int rightDiameter=diameter(root.right);
    
    return Math.max(1+leftHeight+rightHeight, Math.max(leftDiameter, rightDiameter));
  }
  
  public static boolean isHeightBalanced(Node root){
    if(root==null){
      return true;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);
    
    if(Math.abs(leftHeight-rightHeight)>1){
      return false;
    }
    else{
      return true;
    }
  }
  
  public static Node minimalHeightTree(int[] input,int start, int end){
    if(start>end){
      return null;
    }
    int mid=(start+end)/2;
    Node new_node=new Node(input[mid]);
    new_node.left=minimalHeightTree(input, start, mid-1);
    new_node.right=minimalHeightTree(input, mid+1, end);
    return new_node;
  }
  
  public static boolean isBinaryTreeBST(Node root){
    /*
     * Approach-1(wrong):Intuitive solution would be to check if left<=root<right for each node. However this might fail as 
     * a right node in the left subtree might be greater than the root but the logic can't catch it
     * Approach-2: Do an inOrderTraversal and check if the output is sorted. 
     * Might not work if the tree contains duplicates
     * Approach-3: Check the maximum in the left subtree<=root<minimum in the right sub tree. 
     * Takes care of the failure case in approach-1 
    */
    if(root==null){
      return true;
    }
    int maxInLeft=findMax(root.left);
    int minInRight=findMin(root.right);
    
    boolean left=isBinaryTreeBST(root.left);
    boolean right=isBinaryTreeBST(root.right);
    
    if(maxInLeft<=root.data && root.data<minInRight && left && right){
      return true;
    }
    else{
      return false;
    }
  }
  
  /*
   * Approach-1: Assuming pointer to parent node exist. 
   * Two cases: If right subtree is not empty, return minimum in right subtree
   * else, traverse up until we find a parent under whose left subtree the node exist
   * Approach-2: If right subtree is not empty, return minimum in right subtree
   * else, whenever you are taking left turn, node the node. Do it until you find node whose successor is needed.
   * The last noted node is the successor 
  */
  public static void inOrderSuccessorWithParent(Node node){
     /*if(node.right!=null){
       findMin(node.right);
     }
     else{
       Node p=node.parent;
       while(p!=null && p.right==null){
         n=p;
         p=p.parent;
       }
       return p;
     }*/
  }
  
  public static void inOrderSuccessor(Node node){
    // Refer to BST file
  }
}