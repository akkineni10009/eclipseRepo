package JavaAlgorithms;

public class SelectionSort {
  
  static int[] input = {15,13,2,78,9,43,56};
  public static void main(String[] args)
  {
    selectionSort();
  }
  
  public static void selectionSort()
  {
    int temp,min,min_index = 0; 
    for(int i=0;i<input.length;i++)
     {
       min=input[i];
       for(int j=i;j<input.length;j++)
       {
         if(input[j]>=min)
         {
           min=input[j];
           min_index=j;
         }
         
       }
       
       temp=input[i];
       input[i]=min;
       input[min_index]=temp;
       
      }
      for(int k:input)
      {
        System.out.println(k);
      }
     
  }
  
  
  }