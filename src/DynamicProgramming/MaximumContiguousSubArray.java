package DynamicProgramming;

public class MaximumContiguousSubArray {
  
  public static int nums[] = {1,-3,4,-2,-1,6};
  
  public static void main(String[] args)
  {
    maxSubArrayWithN3Complexity(nums);
    maxSubArrayWithN2Complexity(nums);
    maxSubArrayWithNComplexity(nums);
  }
  
  public static int maxSubArrayWithN3Complexity(int[] nums) {
    int max_sum=0;
    for(int i=0;i<nums.length;i++)
    {
      for(int j=i;j<nums.length;j++)
        {
          int current_sum=0;  
          for(int k=i;k<=j;k++)
            {
                current_sum+=nums[k];
            }
            if(current_sum>max_sum)
                max_sum=current_sum;
        }
    }
    System.out.println(max_sum);
    return max_sum;
}
  
  public static int maxSubArrayWithN2Complexity(int[] nums) {
      int max_sum=0;
      for(int i=0;i<nums.length;i++)
      {
        int current_sum=0;  
        for(int j=i;j<nums.length;j++)
          {
            
            current_sum+=nums[j];

            /*for(int k=i;k<=j;k++)
              {
                  current_sum+=nums[k];
              }*/
              if(current_sum>max_sum)
                  max_sum=current_sum;
          }
      }
      System.out.println(max_sum);
      return max_sum;
  }
  
  public static int maxSubArrayWithNComplexity(int[] nums)
  {
    int max_sum=0;
    int current_sum=0;
    for(int i=0;i<nums.length;i++)
    {
      current_sum=Math.max(nums[i],current_sum+nums[i]);
      max_sum=Math.max(current_sum, max_sum);
    }
    System.out.println(max_sum);
    return max_sum;
    
  }
}