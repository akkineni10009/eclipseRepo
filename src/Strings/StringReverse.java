package Strings;

public class StringReverse {
  
  public static void main(String[] args)
  {
    reverse();
    //reverse2();
    //reverse3();
  }
  
  public static void reverse()
  {
    String a="abdghamm";
    StringBuilder sb = new StringBuilder();
    sb.append(a);
    sb.reverse();
    System.out.println(sb.toString());
  } 
  
  public static void reverse2()
  {
    String a="abdghamm";
    char[] input = a.toCharArray();
    char[] input2= new char[input.length];
    for(int i=0,j=input.length-1;i<input.length && j>=0;i++,j--)
    {
      input2[j]=input[i];
    }
    String output=String.valueOf(input2);
    System.out.println(output);
  }
  
  public static void reverse3()
  {
    String a="abdghamm";
    StringBuilder sb=new StringBuilder();
    for(int i=a.length()-1;i>=0;i--)
    {
      sb.append(a.charAt(i));
    }
    sb.toString();
    System.out.println(sb);
  }
}
