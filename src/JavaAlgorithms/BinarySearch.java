package JavaAlgorithms;

public class BinarySearch {

  static int[] input = {1,2,3,4,5,6,7,8,9};
  public static void main(String[] args)
  {
    binarySearch(10);
  }
  
  public static void binarySearch(int value)
  {
    int low=0,high=input.length-1;
    int mid;
    while(low<=high)
    {
      mid=(low+high)/2;
      if(value<input[mid])
      {
        high=mid-1;
      }
      
      else if (value>input[mid])
      {
        low=mid+1;
      }
      
      else
      {
        System.out.println("Found");
        low=high;
      }
    }
  }
}
