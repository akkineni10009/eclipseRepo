package LinkedList;

import java.util.Stack;

public class CheckPalindrome {
  static Node start=null;
  public static void main(String []args){
    
    insertBeginning(1);
    insertBeginning(2);
    insertBeginning(3);
    insertBeginning(2);
    insertBeginning(1); 
    
    printList(start);
    boolean return_value=checkPalindrome();
    System.out.println(return_value);
  }
  public static void insertBeginning(int data)
  {
      Node new_node = new Node();
      new_node.setData(data);
      new_node.setNext(start);
      start=new_node;
  }
  
  public static void printList(Node start)
  {
      for(Node temp=start;temp!=null;temp=temp.getNext())
      {
        System.out.println(temp.getData());
      }
  }
  
  public static boolean checkPalindrome()
  {
    Stack<Integer> stack = new Stack<Integer>();
    for(Node temp=start;temp!=null;temp=temp.getNext())
    {
      stack.push(temp.data);
    }
    
    for(Node temp=start;temp!=null;temp=temp.getNext())
    {
      if(temp.data!=stack.pop())
      {
        return false;
      }
    }
    return true;
  }
}
