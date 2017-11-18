package DynamicProgramming;

public class LongestCommonSubsequence {

  public static String m = "ABCDGHLQR";
  public static String n = "AEDPHR";
  public static void main(String[] args)
  {
    System.out.println(findCommonSubsequencePolynomial(m,n));
    System.out.println(findCommonSubsequenceDynamic(m,n));
  }
  
  // This is a recursive approach. As you can see the same computation is being performed again and again
  // and this is a polynomial time complexity solution
  
  public static String findCommonSubsequencePolynomial(String m, String n)
  {
    String a,b;
    int mlength= m.length();
    int nlength = n.length();
    if(mlength==0 | nlength==0)
      return "";
   
    if(m.charAt(mlength-1)==n.charAt(nlength-1))
      return findCommonSubsequencePolynomial(m.substring(0,mlength-1),n.substring(0, nlength-1)) 
          + m.charAt(m.length()-1);
    else
       a = findCommonSubsequencePolynomial(m.substring(0,mlength),n.substring(0, nlength-1));
       b = findCommonSubsequencePolynomial(m.substring(0,mlength-1),n.substring(0, nlength));
       
       return a.length()>b.length()?a:b;
  }
  
  public static int findCommonSubsequenceDynamic(String m, String n)
  {
    int max=0;
    int mlength= m.length();
    int nlength = n.length();
    int result[][] = new int[mlength+1][nlength+1];
    
    for(int i=1;i<result.length;i++)
    {
      for(int j=1;j<result[i].length;j++)
      {
         if(m.charAt(i-1)==n.charAt(j-1))
         {
           result[i][j]= result[i-1][j-1]+1;
         }      
         else
         {
           result[i][j]= Math.max(result[i-1][j], result[i][j-1]);
         }
         if(result[i][j]>=max)
         {
           max=result[i][j];
         }
      }
      
    }
      
    return max;
  }
}
