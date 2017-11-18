package Queues;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

  static int size=5;
  static int numberOfelements=0;
  static int front=0;
  static int rear=0;
  static ArrayList<Object> queue= new ArrayList<Object>(size);
  static Queue<Integer> a = new LinkedList<Integer>();
  public SimpleQueue(int size)
  {
    //this.size=size;
    //queue= new ArrayList<Object>(size);
  }
  
  public static void insert(Object toPush)
  {
    if(numberOfelements<=size)
    {
      queue.add(rear,toPush);
      System.out.println("Added element is "+queue.get(rear));
      rear=(rear+1) % size;
      numberOfelements++; 
      
    }
    else
    {
      System.out.println("Queue is full");
    }
  }
  
  public static void remove()
  {
    if(numberOfelements>0)
    {
      System.out.println("Removed element is "+queue.get(front));
      front=(front+1)%size;
      numberOfelements--;
     
    }
    
    else
    {
      System.out.println("Queue is empty"); 
    }      
  }
  
  public static void peek()
  {
    if(numberOfelements>0)
    {
      System.out.println("Peek element is " + queue.get(front));
    }
    
    else
    {
      System.out.println("Queue is empty");
    }
  }
  
  public static void display()
  {
    /*int temp_front=front;
    int temp_rear=rear;
    
    if(temp_front==temp_rear && numberOfelements==1)
    {
      System.out.println(queue.get(temp_front));
    }
    
    else if(temp_front==temp_rear && numberOfelements!=1)
    {
      for(Object k:queue)
      {
        System.out.println(k);
      }
    }
    else
    {
      while(temp_front!=temp_rear)
      {
        System.out.println(queue.get(temp_front));
        temp_front=(temp_front+1)%size;
      }
    }*/
    for(Object k:queue)
    {
      System.out.println(k);
    }
  }
  
  public static void main(String[] args)
  {
    insert(10);
    insert(20);
    remove();
    insert(30);
    insert(40);
    insert(50);
    remove();
    remove();
    insert(60);
    display();
    
    a.add(10);
    Iterator itr=a.iterator();
  }
}
