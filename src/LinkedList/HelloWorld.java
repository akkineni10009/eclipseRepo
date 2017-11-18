package LinkedList;


public class HelloWorld{
    
    public static Node start = null;
    

     public static void main(String []args){
        //System.out.println("Hello World");
       /*hello
        * */
        insertBeginning(1);
        insertBeginning(2);
        insertBeginning(7);
        insertBeginning(5);
        insertBeginning(9); 
        
        //insertAt(3,8);
        //printList(start);
        //System.out.println("*****************************");
        
        //reverseList();
        //reverse();
        //printList(start);
        
        //deleteNode(1);
        //printList(start);
        //System.out.println("*****************************");
        
        //sortList();
        //printList(start);
        
        sort();
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
         for(Node p_temp=start; p_temp !=null; p_temp=p_temp.getNext())
         {
             System.out.println(p_temp.getData());
         }
     }
     
     public static void insertAt(int position, int data)
     {
         
         Node new_node = new Node();
         new_node.setData(data);
         Node temp=start;
         if(position==1)
         {
             new_node.setNext(temp);
             start=new_node;
         }
         else
         {
            for(int count=1;count<position-1;temp=temp.getNext(),count++)
            {
            }
            new_node.setNext(temp.getNext());
            temp.setNext(new_node);
         }
    }
    
    public static void deleteNode(int position)
    {
        Node current_node=start;
        Node previous_node=null;
        
        if(position==1)
        {
            start=start.getNext();
        }
        
        else
        {
            for(int count=1; count<position;count++,previous_node=current_node,current_node=current_node.getNext())
            {
            }
        
            previous_node.setNext(current_node.getNext());
        }
    }
    
    /*public static void reverseList()
    {
      Node current=start,next=null,previous=null;
      for(;current!=null;)
      {
        current=next;
        next=next.getNext();
        current.setNext(previous);
        previous=current;
        next=current.getNext();
        current.setNext(previous);
        previous=current;
        current=next;
      }
      start=previous;
    }*/
    
    public static void reverse()
    {
      Node prev=null,current=start,next=current.next;
      while(current.next!=null)
      {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next; 
      }
      start=prev;
    }
    
    public static void sort()
    {
      Node temp_length=start,i=start,j=start;
      int length=0,current,next,temp;
      for(i=start;i.getNext()!=null;i=i.getNext())
      {
        for(j=start;j.getNext()!=null;j=j.getNext())
        {
          if((j.getNext()).getData() > j.getData())
          {
            //Swap both the values
            temp=(j.getNext()).getData();
            (j.getNext()).setData(j.getData());
            j.setData(temp);
          }
        }
      }
    }
    
    public static void sortList()
    {
        Node previous= start;
        Node next= start.getNext();
        
        int swap=0;
        
        for(;next.getNext()!=null;previous=previous.getNext(),next=next.getNext())
        {
            for(;next.getNext()!=null;previous=previous.getNext(),next=next.getNext())
            {
                if(previous.getData()>next.getData())
                {
                    swap=next.getData();
                    next.setData(previous.getData());
                    previous.setData(swap);
                }
            }
            
            previous= start;
            next= start.getNext();
            
            printList(start);
        }
    }
    
}
