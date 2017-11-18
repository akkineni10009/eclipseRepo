package Strings;

public class MinimumTwoElements {
  
  public static int[] a ={7,-2,5,0,1,9,0};
  
  public static void main(String[] args)
  {
    int length=a.length;
    int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
    for(int i=0;i<length;i++)
    {
      if(a[i]<=min1)
      {
        min2=min1;
        min1=a[i];
      }
      
      else if(a[i]>min1 && a[i]<min2)
      {
        min2=a[i];
      }
    }
    
    System.out.println(min1+" "+min2);
  }

}
