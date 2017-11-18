package TreesAndTries;

public class BinarySearchTree {
 
  public static void main(String[] args)
  {
    Node root = new Node(2);
    insert(root,1);
    insert(root,3);
    //inOrder(root);
    preOrder(root);
    search(root,1);
    search(root,4);
    search(root,0);
    search(root,2);
    search(root,3);
  }
  
  public static void insert(Node root, int value)
  {
    Node new_node = new Node(value);
   
    if(value<=root.data)
    {
      if(root.left==null)
      {
        root.left=new_node;
      }
      else
      {
        insert(root.left,value);
      }
    }
    
    else
    {
      if(root.right==null)
      {
        root.right=new_node;
      }
      else
      {
        insert(root.right,value);
      }
    }

  }
  
  public static void inOrder (Node root)
  {
    if(root!=null)
    {
      inOrder(root.left);
      System.out.println(root.data);
      inOrder(root.right);
    }
  }
  
  public static void preOrder (Node root)
  {
    if(root!=null)
    {
      System.out.println(root.data);
      inOrder(root.left);
      inOrder(root.right);
    }
  }
  
  public static void search(Node root,int value)
  {
    if(root.data==value)
    {
      //return true;
      System.out.println("Found " + value);
    }
    
    else if(value<root.data)
    {
        if(root.left==null)
        {
          //return false;
        }
        else
        {
          search(root.left,value);
        }
    }
    
    else
    {
      if(root.right==null)
      {        //return false;
      }
      
      else
      {
        search(root.right,value);
      }
    }
  }
  
}
