package SortingAndHeaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianInStream {

  public static void main(String[] args) {
    
    PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
    PriorityQueue<Integer> lower = new PriorityQueue<Integer>(new Comparator<Integer>(){
      @Override
      public int compare(Integer a, Integer b){
        return -1* a.compareTo(b);
      }
    });
    // Priority Queue would be minHeap by default. Defining the Comparator to make it maxHeap
    // Lower heap should be a maxHeap and Upper heap should be a minHeap
    // Another way for imposing the reverse order is specified below
    // PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
    
    int[] input = {3,11,5,6,2,100,9,56};
    for(int i=0;i<input.length;i++){
      addNumbers(input[i],lower,higher);
      rebuildHeaps(lower,higher);
      double median=getMedian(lower,higher);
      System.out.println(median);
    }
  }
  
  static void addNumbers(int element, PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
    if(lower.size()==0 || element<=lower.peek()){
      lower.add(element);
    }
    else{
      higher.add(element);
    }
  }
  
  static void rebuildHeaps(PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
    PriorityQueue<Integer> bigger = (lower.size() > higher.size())?lower:higher;
    PriorityQueue<Integer> smaller = (lower.size() > higher.size())?higher:lower;
    
    if(bigger.size() - smaller.size()>=2){
      smaller.add(bigger.poll());
    }
  }
  
  static double getMedian(PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
    PriorityQueue<Integer> bigger = (lower.size() > higher.size())?lower:higher;
    PriorityQueue<Integer> smaller = (lower.size() > higher.size())?higher:lower;
    
    if(bigger.size()==smaller.size()){
      return (double) (smaller.peek()+ bigger.peek())/2;
    }
    return bigger.peek();
  }
}
