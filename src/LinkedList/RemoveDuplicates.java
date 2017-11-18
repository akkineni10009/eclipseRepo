package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
  static Node start=null;
  public static void main(String []args){
    
    insertBeginning(3);
    insertBeginning(2);
    insertBeginning(1);
    insertBeginning(2);
    insertBeginning(1);
    insertBeginning(3);
    
    //printList(start);
    removeDuplicates();
    printList(start);
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
  
  public static void removeDuplicates()
  {
    Set<Integer> set = new HashSet<Integer>();
    for(Node temp=start;temp!=null;temp=temp.next)
    {
      if(set.contains(temp.data))
      {
        delete(temp);
      }
      else
      {
        set.add(temp.data);
      }
    }
  }
  
  public static void delete(Node deleteNode)
  {
    Node temp=start;
    while(temp.next!=deleteNode)
    {
      temp=temp.next;
    }
    
    temp.next=deleteNode.next;
  }
}
