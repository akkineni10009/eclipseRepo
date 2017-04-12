package JavaAlgorithms;

public class InsertionSort {
  
  static int[] input = {15,13,2,78,43,56};
  public static void main(String[] args)
  {
    insertionSort();
  }
  
  public static void insertionSort()
  {
    
    int insertvalue;
    for(int i=1;i<input.length;i++)
    {
      
      int j=i;
      insertvalue=input[j];
      for(;j>0 && input[j-1]<insertvalue;j--)
      {
        input[j]=input[j-1];
      }
      
      input[j]=insertvalue;
    }
     
    for(int k:input)
    {
      System.out.println(k);
    }
  }
  
  
  }