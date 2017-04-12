import java.util.Scanner;

public class Analysis_I2 {

  public static void main(String[] args)
  {
    System.out.println("Enter the number you want to test");
    int input;
    Scanner sc = new Scanner(System.in);
    input=sc.nextInt();
    isPositive(input);
  }
  
  public static void isPositive(int num)
  {
    String temp=null;
    if(num>0)
    {
      System.out.println(temp.length());
    }
  }
}
