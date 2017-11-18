package SortingAndHeaps;

public class HeapSort {

  public static void main(String args[])
  {
      int arr[] = {12, 11, 13, 5, 6, 7};
      heapSort(arr);
  }
  
  public static void heapSort(int[] arr)
  {
    buildHeap(arr);
    printSorted(arr);
  }
  
  public static void buildHeap(int[] arr)
  {
    int length=arr.length;
    for(int i=(length/2)-1;i>=0;i--)
    {
      heapify(arr,length,i); //building the heap
    }
    
    for(int j=length-1;j>=0;j--) //sorting 
    {
      int temp=arr[0];
      arr[0]=arr[j];
      arr[j]=temp;
      
      heapify(arr,j,0); // Here we should pass the array size
    }
  }
  
  public static void heapify(int[] arr, int length, int index)
  {
     
     int leftchildIndex=2*(index)+1;
     int rightchildIndex=2*(index)+2;
     int smallestIndex=index;
     
     
     if(leftchildIndex<length && arr[leftchildIndex]<arr[smallestIndex])
     {
       smallestIndex=leftchildIndex;
     }
     
     if(rightchildIndex<length && arr[rightchildIndex]<arr[smallestIndex])
     {
       smallestIndex=rightchildIndex;
     }
     
     if(smallestIndex!=index)
     {
       int temp=arr[index];
       arr[index]=arr[smallestIndex];
       arr[smallestIndex]=temp;
       
       heapify(arr,length,smallestIndex);
     }
     
  }
  
  public static void printSorted(int[] arr)
  {
    for(int i: arr)
    {
      System.out.println(i);
    }
  }
}