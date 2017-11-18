package DynamicProgramming;

public class KnapsackProblem {
  public static void main(String args[])
  {
      int val[] = new int[]{60, 100, 120};
      int wt[] = new int[]{10, 20, 30};
      int  W = 50;
      int n = val.length;
     // System.out.println(KnapSack(W, wt, val, n));
      System.out.println(knapSackDynamic(W, wt, val, n));
  }
  
  // This is a recursive method. It has optimal substructure property.
  public static int KnapSack(int W, int[] wt, int[] val, int n)
  {
    if(W==0 || n==0)
    {
      return 0;
    }
    
    if(wt[n-1]>W)
    {
      return KnapSack(W,wt,val,n-1);
    }
    
    else
    {
      return Math.max(val[n-1]+KnapSack(W-wt[n-1],wt,val,n-1), KnapSack(W,wt,val,n-1));
    }
  }
  
  // As we can see there are repetetive calculations. It has overlapping subproblems. Both the properties of
  //Dynamic programming are satisfied. Plot a matrix with size on the Rows and value on the Columns
  
  static int knapSackDynamic(int W, int wt[], int val[], int n)
  {
       int i, w;
   int K[][] = new int[n+1][W+1];
    
   // Build table K[][] in bottom up manner
   for (i = 0; i <= n; i++)
   {
       for (w = 0; w <= W; w++)
       {
           if (i==0 || w==0)
                K[i][w] = 0;
           else if (wt[i-1] <= w)
                 K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
           else
                 K[i][w] = K[i-1][w];
       }
    }
    
    return K[n][W];
}
  
}
