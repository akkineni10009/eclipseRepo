package DynamicProgramming;

public class CoinChange {
  static int count=0;
  public static void main(String args[])
  {
      count(1, 4); // Don't pass count(0,4) here, the recursion tree will run twice and answer will be double than required
      // System.out.println(count);
      
      int denom[] = {1, 2, 3};
      int result=countEfficient(denom,3,5);
      System.out.println(result);
      
      int resultdp=countDp(denom,3,5);
      System.out.println(resultdp);
  }
  // Assume I have denominations for 1,2,3 rupees
  static void count(int currentSum,int requiredSum){
    if(currentSum==requiredSum){
      count++;
      return;
    }
    
    if(currentSum>requiredSum){
      return ;
    }
    
    count(currentSum+1,requiredSum);
    count(currentSum+2,requiredSum);
    count(currentSum+3,requiredSum);
  }
  
  static int countEfficient(int[] denom,int coin,int sum){
    if(sum==0){
      return 1;
    }
    if(sum<0){
      return 0;
    }
    
    if(coin<=0&& sum>=1){
      return 0;
    }
    return countEfficient(denom,coin-1,sum)+countEfficient(denom,coin,sum-denom[coin-1]);
  }
  
  static int countDp(int[]denom,int coin,int sum){
    int[][] dp= new int[denom.length+1][sum+1];
    for(int i=0;i<denom.length;i++){
      dp[i][0]=1;
    }
    for(int i=1;i<=denom.length;i++){
        for(int j=1;j<=sum;j++){
          if(j>=denom[i-1]){
             dp[i][j]=dp[i-1][j]+dp[i][j-denom[i-1]];
          }
          else{
            dp[i][j]=dp[i-1][j];
          }
        }
    }
    return dp[denom.length][sum];
  }
}