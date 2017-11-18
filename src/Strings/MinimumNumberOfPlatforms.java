package Strings;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
  
  static int arr[]={900, 940, 950, 1100, 1500, 1800};
  static int dep[]={910, 1200, 1120, 1130, 1900, 2000};
  
  public static void main(String[] args)
  {
    minNumberOfPlatforms();
  }
  
  public static void minNumberOfPlatforms()
  {
    int length=arr.length;
    Arrays.sort(arr);
    Arrays.sort(dep);
    
    int result=1;
    int max_result=1;
    
    for(int i=1,j=0;i<length && j<length;)
    {
      if(arr[i]<=dep[j])
      {
        result++;
        i++;
        if(max_result<=result) 
         {
            max_result=result;
         }
      }
      
      else
      {
        result--;
        j++;
      }
    }
    System.out.println(max_result);
    
  }
}
