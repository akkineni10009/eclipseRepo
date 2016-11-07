import java.io.IOException;

public class Fcs_q5 {

  public static void main(String[] args) throws IOException
  {
    long startTime = System.nanoTime();
    System.out.println(power(123456789,10000000));
    long endTime = System.nanoTime();
    System.out.println("Took "+(endTime - startTime) + " ns");   
    
  }
  
  public static long power(long x, long n)
  {
    if(n==0) return 1;
    if(n==1) return x;
    if((n%2)==0) return power(x*x, n/2);
    else return (power(x*x, n/2)*x);
  }
 
}
