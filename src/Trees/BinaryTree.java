package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
  
  public static int max;
  public static void main(String[] args)
  {
    Node n1 = new Node(1);
    Node n2= new Node(2);
    Node n3= new Node(3);
    Node n4= new Node(4);
    Node n5= new Node(5);
    Node n6= new Node(6);
    Node n7= new Node(7);
   // Node n8= new Node(8);
   // Node n9= new Node(9);
    
    n1.left=n2;
    n1.right=n3;
    n2.left=n4;
    n2.right=n5;
    n3.left=n6;
    n3.right=n7;
   
    
   /* preOrder(n1);
    System.out.println("****************************");
    
    inOrder(n1);
    System.out.println("****************************");
    
    postOrder(n1);
    System.out.println("****************************");
    
    getElementsByLevel(n1); // BFS Algorithm
    System.out.println("****************************");
    
    DFS Algorithm. PreOrder traversal are same.
    
    System.out.println(findMax(n1));
    
    System.out.println("****************************");*/
  }
  
  public static void preOrder(Node root)
  {
    if(root!=null)
    {
      System.out.println(root.getData());
      preOrder(root.left);
      preOrder(root.right);
    }
  }
  
  public static void inOrder(Node root)
  {
    if(root!=null)
    {
      inOrder(root.left);
      System.out.println(root.data);
      inOrder(root.right);
    }
  }
  
  public static void postOrder(Node root)
  {
    if(root!=null)
    {
      postOrder(root.left);
      postOrder(root.right);
      System.out.println(root.getData());
    }
  }
  
  public static void getElementsByLevel(Node root)
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    ArrayList<Integer> result= new ArrayList<Integer>();
    Node temp=root;
    
    while(!queue.isEmpty())
    {
      temp=queue.poll();
      result.add(temp.getData());
      if(temp.left!=null)
      {
        queue.add(temp.left);
      }
    
      if(temp.right!=null)
      {
        queue.add(temp.right);
      }
    }
    
    for(int element:result)
    {
      System.out.println(element);
    }
  }
  
  public static int findMax(Node root)
  {
      int max=Integer.MIN_VALUE;
      if(root!=null)
      {
        int leftMax=findMax(root.left);
        int rightMax=findMax(root.right);
            
        if(leftMax>rightMax)
        {
          max=leftMax;
        }
        else
        {
          max=rightMax;
        }
        
        if(root.data>max)
        {
          max=root.data;
        }
        }
      return max;
  }

}