package LinkedList;

public class Node
{
    public int data;
    public Node next;
    
    public Node()
    {
       //this.data=data;
       //this.next=next;
    }
    
   /*
    public Node(int data, Node next)
    {
       this.data=data;
       this.next=next;
    }*/
    
    public int getData()
    {
        return this.data;
    }
    
    public Node getNext()
    {
        return this.next;
    }
    
    public void setData(int data)
    {
        this.data=data;
    }
    
    public void setNext(Node next)
    {
        this.next=next;
    }
}