package DynamicProgramming;

public class LongestPalindromicSubsequence {

  public static void main(String args[])
  {
      String seq = "GPAPGPG";
      System.out.println("The lnegth of the lps is "+ lps(seq,0,seq.length()-1));
      System.out.println("The lnegth of the lps is "+ lpsDynamic(seq));
  }
  
  /*
   * Following is a recursive solution to the problem. It has optimal sub-structure property 
   * and over-lapping sub problems. So, dynamic programming can be applied
   */
  public static int lps(String seq,int i,int j)
  {
    if(i==j)
    {
      return 1;
    }
     
    if(seq.charAt(i)==seq.charAt(j))
    {
      return 2+lps(seq,i+1,j-1);
    }
    
    return Math.max(lps(seq,i+1,j), lps(seq,i,j-1));
   }
  
  /*
   * In dynamic programming, we store a matrix which has starting index in the y-axis and ending index in the x-axis
   * We calculate the upper right angled matrix and return matrix[0][n] which means lps starting at 0, ending at n
   */
  
  public static int lpsDynamic(String seq)
  {
    int length=seq.length();
    int[][] result = new int[length][length];
    int cl=0,j=0;
    
    for(int i=0;i<length;i++)
    {
        result[i][i]=1;
    }
    
    for(cl=2;cl<=length;cl++)
    // This loop runs for n-1 times. The first row needs to run for n-1 times since first cell is already filled.
    {
      for(int i=0;i<length-cl+1;i++) 
      {
        j=i+cl-1;    
        if(seq.charAt(i)==seq.charAt(j))
        {
          result[i][j]=2+result[i+1][j-1];
        }
        if(seq.charAt(i)!=seq.charAt(j))
        {
          result[i][j]=Math.max(result[i+1][j], result[i][j-1]);
        }
      }
    }
    
    return result[0][length-1];
  }
  
}
