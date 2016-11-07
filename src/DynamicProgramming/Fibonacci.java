package DynamicProgramming;

public class Fibonacci {
  
  static int[] lookup=new int[40];

  public static void main(String[] args)
  {
   System.out.println(fibonacciSimpleRecursion(39));
   //System.out.println(fibonacciDynamicProgramming(39));
    
  }
     
  public static int fibonacciSimpleRecursion(int n)
  {
    if(n<=1)
      return n;
    else
    {
      return fibonacciSimpleRecursion(n-1)+fibonacciSimpleRecursion(n-2);
    }
  }
  
  public static int fibonacciDynamicProgramming(int n)
  {
    if(lookup[n]==0)
    {
      if(n<=1)
      lookup[n]=n;
    
     else
     {
       lookup[n]=fibonacciDynamicProgramming(n-1)+fibonacciDynamicProgramming(n-2);
     }
    
    }
    return lookup[n];
    
      
  }
  
  
}
