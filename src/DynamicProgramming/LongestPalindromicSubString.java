package DynamicProgramming;

public class LongestPalindromicSubString {
  public static void main(String args[])
  {
      String seq = "forgeeksskeegfor";
      lps(seq,0);
  }
  
  public static void lps(String word, int i)
  {
    int n=word.length();
    boolean[][] result = new boolean[n][n];
    
    for(int m=0;m<n;m++)
    {
      result[m][m]=true;
    }
    
    int start=0,maxlength=0;
    for(int m=0;m<n-1;m++)
    {
      if(word.charAt(m)==word.charAt(m+1))
      {
        result[m][m+1]=true;
        start=i;
        maxlength=2;
      }
    }
    
    for (int k = 3; k <= n; ++k)
    {
        // Fix the starting index
        for (int x = 0; x < n-k+1 ; ++x)
        {
            // Get the ending index of substring from
            // starting index i and length k
            int y = x + k - 1;
 
            // checking for sub-string from ith index to
            // jth index iff str[i+1] to str[j-1] is a
            // palindrome
            if (result[x+1][y-1] && word.charAt(x) == word.charAt(y))
            {
                result[x][y] = true;
 
                if (k > maxlength)
                {
                    start = x;
                    maxlength = k;
                }
            }
        }
    }
    print(word,start,start+maxlength-1);
  }
  
  public static void print(String word, int start, int end)
  {
    System.out.println(start+"   "+end);
    System.out.println(word.substring(start, end+1));
  }
  
}
