package SortingAndHeaps;

public class BubbleSort {
  
  static int[] input = {15,13,2,78,43,56};
  public static void main(String[] args)
  {
    bubbleSort();
  }
  
  public static void bubbleSort()
  {
    int temp; 
    for(int i=input.length-1;i>1;i--)
     {
       for(int j=0;j<i;j++)
       {
         if(input[j]>input[j+1])
         {
           temp=input[j];
           input[j]=input[j+1];
           input[j+1]=temp;
         }
         
        }
       
      }
      for(int k:input)
      {
        System.out.println(k);
      }
     
  }
  
  
  }