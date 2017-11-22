package Goldman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LinkedListOperations {
  static Node start=null;
  public static void main(String[] args){
    start=addToList(start,1);
    start=addToList(start,2);
    start=addToList(start,3);
    start=addToList(start,4);
    start=addToList(start,5);
    start=addToList(start,6);
    start=addToList(start,7);
    // reverseList();
    // deleteElement(1);
    // middleElement();
    // removeElementGivenPointerToThatNode(start.getNext().getNext());
    // getKthElementFromEnd(3);
    // removeDuplicatesFromUnsortedList();
    // partitionElement(2);
    // partitionElementEfficient(4);
    // sumTwoNumbersInReverseOrderInList();
    // isPlaindrome();
    // intersectingLists();
    // printList(start);
    detectLoop();
  }
  
  public static Node addToList(Node start,int data){
    Node new_node = new Node();
    new_node.setData(data);
    new_node.setNext(start);
    start=new_node;
    return start;
  }
  
  public static void printList(Node start){
    Node temp=start;
    for(;temp!=null;temp=temp.getNext()){
      System.out.println(temp.getData());
    }
  }
  
  public static void reverseList(){
    Node prev=null,current=start,next=start;
    while(current!=null){
      next=current.getNext();
      current.setNext(prev);
      prev=current;
      current=next;
    }
    start=prev;
  }
  
  public static void deleteElement(int index){
    int count=1;
    Node current=start,prev=null;
    
    if(index==1){
      start=start.getNext();
      return ;
    }
    while(count!=index){
      count++;
      prev=current;
      current=current.getNext();
    }
    prev.setNext(current.getNext());
  }
  
  public static void middleElement(){
    Node fast=start,slow=start;
    for(;fast.getNext()!=null && fast.getNext().getNext()!=null;slow=slow.getNext(),fast=fast.getNext().getNext()){
    }
    System.out.println(slow.getData());
  }
  
  public static void removeElementGivenPointerToThatNode(Node removeElement){
    removeElement.setData(removeElement.getNext().getData());
    removeElement.setNext(removeElement.getNext().getNext());
  }
  
  public static void getKthElementFromEnd(int k){
    Node first=start,second=start;
    int count=1;
    while(count!=k){
      count++;
      first=first.getNext();
    }
    while(first.getNext()!=null){
      first=first.getNext();
      second=second.getNext();
    }
    System.out.println(second.getData());
  }
  
  public static void removeDuplicatesFromUnsortedList(){
    Set<Integer> set = new HashSet<Integer>();
    Node temp=start;
    for(;temp!=null;){
      if(set.contains(temp.getData())){
        temp.setData(temp.getNext().getData());
        temp.setNext(temp.getNext().getNext());
      }
      else{
        set.add(temp.getData());  
        temp=temp.getNext();
      }
      
    }
  }
  
  public static void partitionElement(int element){
    Node temp=start;
    int front=0,end=0;
    ArrayList<Integer> list= new ArrayList<Integer>();
    for(;temp!=null;temp=temp.getNext()){
      if(temp.getData()<element){
        list.add(end,temp.getData());
      }
      else{
        list.add(front,temp.getData());
      }
      end++;
    }
    start=null;
    for(int i=0;i<list.size();i++){
      addToList(start,list.get(i));
      // System.out.println(list.get(i));
    }
    // Shifting array elements can be expensive and so we can use a linked list based approach
  }
  
  public static void partitionElementEfficient(int element){
    Node lessThan=null;
    Node greaterThan=null;
    Node temp=start;
    Node temp2;
    
    for(;temp!=null;temp=temp.getNext()){
      Node new_node= new Node();
      new_node.setData(temp.getData());
      if(temp.getData()<element){
        new_node.setNext(lessThan);
        lessThan=new_node;
      }
      else{
        new_node.setNext(greaterThan);
        greaterThan=new_node;
      }
    }
    temp2=lessThan;
    while(temp2.getNext()!=null){
      temp2=temp2.getNext();
    }
    temp2.setNext(greaterThan);
    start=lessThan;
  }
  
  public static void sumTwoNumbersInReverseOrderInList(){
    Node list1=null,list2=null,output=null;
    list1=addToList(list1, 1);
    list1=addToList(list1, 2);
    list1=addToList(list1, 3);
    list2=addToList(list2, 1);
    list2=addToList(list2, 2);
    
    Node list1Temp=list1,list2Temp=list2;
    int sum=0,offset=0;
    
    for(;list1Temp!=null && list2Temp!=null;list1Temp=list1Temp.getNext(),list2Temp=list2Temp.getNext()){
      sum=(list1Temp.getData()+list2Temp.getData())%10;
      output=addToList(output,sum+offset);
      offset=(list1Temp.getData()+list2Temp.getData())/10;
    }
    if(list1Temp==null){
      for(;list2Temp!=null;list2Temp=list2Temp.getNext()){
        output=addToList(output,list2Temp.getData()+offset);
        offset=0;
      }
    }
    else{
       for(;list1Temp!=null;list1Temp=list1Temp.getNext()){
        output=addToList(output,list1Temp.getData()+offset);
        offset=0;
      }
    }
    printList(output);
    /*
     * If the numbers are stored in the actual order, either iterate and put them in a stack/array list
     * Retrieve them and construct a new list. Or reverse the list and perform same algorithm.
    */
  }
  
  public static boolean isPlaindrome(){
    Stack<Integer> stack = new Stack<Integer>();
    Node temp=start;
    for(;temp!=null;temp=temp.getNext()){
      stack.push(temp.getData());
    }
    for(temp=start;temp!=null;temp=temp.getNext()){
      if(stack.isEmpty() || stack.pop()!=temp.getData()){
        System.out.println("false");
        return false;
      }
    }
    System.out.println("true");
    return true;
  }
  
  public static void intersectingLists(){
    Node list1=null,list2=null;
    list1=addToList(list1, 1);
    list1=addToList(list1, 2);
    list1=addToList(list1, 3);
    list1=addToList(list1, 4);
    list1=addToList(list1, 5);
    list2=addToList(list2, 6);
    list2.setNext(list1.getNext().getNext());
    
    int length1=0,length2=0;
    Node temp1=list1,temp2=list2;
    
    for(;temp1!=null;temp1=temp1.getNext()){
      length1++;
    }
    for(;temp2!=null;temp2=temp2.getNext()){
      length2++;
    }
    
    int diff= length1-length2;
    int temp_count=0;
    temp1=list1;
    temp2=list2;
    
    if(diff>0){
      for(;diff!=temp_count;temp_count++){
        temp1=temp1.getNext();    
      }
    }
    else{
      for(;diff!=temp_count;temp_count--){
        temp2=temp2.getNext();    
      }
    }
    
    for(;temp1!=null && temp2!=null;temp1=temp1.getNext(),temp2=temp2.getNext()){
      if(temp1==temp2){
        System.out.println("Intersect at "+temp1.getData());
        break;
      }
    }
  }
  
  public static void detectLoop(){
    Node temp=start;
    for(;temp.getNext()!=null;){
      temp=temp.getNext();
    }
    temp.setNext(start.getNext().getNext());
    
    Node slow=start,fast=start;
    for(;fast.getNext()!=null && fast.getNext().getNext()!=null;){
      slow=slow.getNext();
      fast=fast.getNext().getNext();
      if(slow==fast){
        System.out.print("Loops exists ");
        break;
      }
    }
    
    if(fast.getNext()==null && fast.getNext().getNext()==null){
      System.out.println("No loop");
    }
    else{
      temp=start;
      while(slow!=temp){
        temp=temp.getNext();
        slow=slow.getNext();
      }
      System.out.println(slow.getData());
    }
  }
}