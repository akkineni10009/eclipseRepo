package DynamicProgramming;

import java.util.ArrayList;

public class LongestIncreasingSubSequence {

  public static int nums[] = {5,6,2,3,4,1,9,9,8,9,5};
  public static int lis[] = new int[nums.length];
  //public static ArrayList<Integer> actualVal = new ArrayList<Integer>();
  
  public static void main(String[] args)
  {
    findLongestIncreasingSubsequence(nums);
  }
  
  public static void findLongestIncreasingSubsequence(int nums[])
  {
    int max_lis=1;
    for(int i=0;i<lis.length;i++)
    {
       lis[i]=1;
    }
    
    for(int i=0;i<nums.length;i++)
    {
      for(int j=0;j<=i;j++)
      {
        if(nums[i]>nums[j] && lis[i]<lis[j]+1)
        {
          lis[i]=lis[j]+1;
          //actualVal.add(nums[i]);
          
        }
      }
    }
    
    for(int i=0;i<lis.length;i++)
    {
       if(lis[i]>=max_lis)
         max_lis=lis[i];
    }
    
    System.out.println(max_lis );
    
    /*for(int i: actualVal)
    {
      System.out.println(i);
    }*/
  }
}
