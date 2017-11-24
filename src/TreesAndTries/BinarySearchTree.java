package TreesAndTries;

public class BinarySearchTree {
  static Node root;
  public static void main(String[] args){
    root=insertDriver(2);
    root=insertDriver(1);
    root=insertDriver(3);
    root=insertDriver(6);
    root=insertDriver(4);
    root=insertDriver(5);
    // inOrder(root);
    /*search(root,1);
    search(root,4);
    search(root,0);
    search(root,2);
    search(root,3);*/
    int result=inOrderSuccessor(root,root.right.right.left.right);
    System.out.println(result);
  }
  
  public static Node  insertDriver(int value){
    root=insertInBST(root, value);
    return root;
  }
  
  public static Node insertInBST(Node root,int value){
    if(root==null){
      root=new Node(value);
      return root;
    }
    else if(value<=root.data){
      root.left=insertInBST(root.left,value);
    }
    else{ 
      root.right=insertInBST(root.right,value);
    }
    return root;
  }
  
  public static void inOrder(Node root){
    if(root==null){
       return ;
    }
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }
  
  public static void search(Node root,int value){
    if(root==null){
      System.out.println("Not Found");
      return ;
    }
    if(value==root.data){
      System.out.println("Found");
      return ;
    }
    else if(value<=root.data){
      search(root.left,value);
    }
    else{
      search(root.right,value);
    }
  }
  
  public static int findMin(Node root){
    if(root==null){
      return Integer.MAX_VALUE;
    }
    int left=findMin(root.left);
    int right=findMin(root.right);
    
    return Math.min(root.data, Math.min(left, right));
  }
  public static int inOrderSuccessor(Node root,Node node){
    int successor=root.data;
    if(node.right!=null){
     successor= findMin(node.right);
     return successor;
    }
    while(root!=null){
      if(root.data==node.data){
        break;
      }
      else if(node.data<root.data){
        successor=root.data;
        root=root.left;
      }
      else{
        root=root.right;
      }
    }
    return successor;
  }
}