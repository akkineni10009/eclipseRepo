package DivideAndConquer;

public class QuickSort {

  public static int[] input = {7,5,10,14,9,6,3,8};
  public static int low=0, high=input.length-1,index=0,partition_element=0;
  public static void main(String[] args)
  {
    quicksort(input,low,high);
    for(int i:input)
    {
      System.out.println(i);
    }
  }
  
  public static void quicksort(int[] input, int low, int high)
  {
     if(low>=high)
     {
       return;
     }
     partition_element=input[(low+high)/2]; 
     index= partition(input, low, high, partition_element);
     quicksort(input, low, index-1);
     quicksort(input, index, high);
  }
  
  public static int  partition (int[] input, int low, int high,int partition_element)
  {
      
      int temp_swap=0;
      while(low<=high)
       {
         while(input[low]<partition_element)
         {
           low++;
         }
         while(input[high]>partition_element)
         {
           high--;
         }
         if(low<=high)
         {
           temp_swap=input[low];
           input[low]=input[high];  
           input[high]=temp_swap;
           low++;
           high--;
         }
       }
      return low;
  } 
}
