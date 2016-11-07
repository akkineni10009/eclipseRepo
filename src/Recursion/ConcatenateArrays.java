package Recursion;

public class ConcatenateArrays {
  
  static int[] a1={1,2,3};
  static int[] a2={4,5,6};
  
  public static void main(String[] args)
  {
    concatenate(a1,a2);
  }
  
  public static int concatenate(int[] a1, int[] a2)
  {
      concatenate(a1,a2);
      return 1;
  }
}
