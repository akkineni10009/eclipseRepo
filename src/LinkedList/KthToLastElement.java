package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class KthToLastElement {
  static Node start=null;
  public static void main(String []args){
    
    insertBeginning(1);
    insertBeginning(2);
    insertBeginning(3);
    insertBeginning(4);
    insertBeginning(5);
    insertBeginning(6);
    
    //printList(start);
    kthLast(3);
    //printList(start);
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
  
  public static void kthLast(int k)
  {
    Node front=start;
    Node back=start;
    int count=0;
    while(count<k)
    {
      front=front.next;
      count++;
    }
    
    while(front.next!=null)
    {
      front=front.next;
      back=back.next;
    }
    
    System.out.println(back.data);
  }
 
}
