package DynamicProgramming;

public class LongestPathInMatrix {
  public static void main(String[] args) {
    int[][] graph = {{1, 2, 9}, {5, 3, 8}, {4, 6, 7}};
    int globalMax = 1;
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph[0].length; j++) {
        int currentMax = findLongestPath(graph, i, j);
        if (currentMax > globalMax) {
          globalMax = currentMax;
        }
      }
    }
    System.out.println(globalMax);
  }

  static int findLongestPath(int[][] graph, int currentI, int currentJ) {
    int top = 1, bottom = 1, left = 1, right = 1;

    if (!isSafe(graph, currentI, currentJ)) {
      return 0;
    }

    if (isSafe(graph, currentI - 1, currentJ)) {
      if (!((graph[currentI][currentJ] + 1) != graph[currentI - 1][currentJ])) {
        top = 1 + findLongestPath(graph, currentI - 1, currentJ);
      }
    }

    if (isSafe(graph, currentI + 1, currentJ)) {
      if (!((graph[currentI][currentJ] + 1) != graph[currentI + 1][currentJ])) {
        bottom = 1 + findLongestPath(graph, currentI + 1, currentJ);
      }
    }

    if (isSafe(graph, currentI, currentJ - 1)) {
      if (!((graph[currentI][currentJ] + 1) != graph[currentI][currentJ - 1])) {
        left = 1 + findLongestPath(graph, currentI, currentJ - 1);
      }
    }

    if (isSafe(graph, currentI, currentJ + 1)) {
      if (!((graph[currentI][currentJ] + 1) != graph[currentI][currentJ + 1])) {
        right = 1 + findLongestPath(graph, currentI, currentJ + 1);
      }
    }

    return Math.max(Math.max(Math.max(top, bottom), left), right);
  }

  static boolean isSafe(int[][] graph, int i, int j) {
    if (i >= 0 && i < graph.length && j >= 0 && j < graph[0].length) {
      return true;
    }
    return false;
  }
  
  
  
  static int findLongestFromACell(int i, int j, int mat[][], int dp[][])
  {
      // Base case
      if (i<0 || i>=mat.length || j<0 || j>=mat[0].length)
          return 0;

      // If this subproblem is already solved
      if (dp[i][j] != -1)
          return dp[i][j];

      // Since all numbers are unique and in range from 1 to n*n,
      // there is atmost one possible direction from any cell
      if (j<mat[0].length-1 && ((mat[i][j] +1) == mat[i][j+1]))
          return dp[i][j] = 1 + findLongestFromACell(i,j+1,mat,dp);

      if (j>0 && (mat[i][j] +1 == mat[i][j-1]))
          return dp[i][j] = 1 + findLongestFromACell(i,j-1,mat,dp);

      if (i>0 && (mat[i][j] +1 == mat[i-1][j]))
          return dp[i][j] = 1 + findLongestFromACell(i-1,j,mat,dp);

      if (i<mat[0].length-1 && (mat[i][j] +1 == mat[i+1][j]))
          return dp[i][j] = 1 + findLongestFromACell(i+1,j,mat,dp);

      // If none of the adjacent fours is one greater
      return dp[i][j] = 1;
  }
   
  // Function that returns length of the longest path
  // beginning with any cell
  static int finLongestOverAll(int mat[][])
  {
      // Initialize result
      int result = 1;  

      // Create a lookup table and fill all entries in it as -1
      int[][] dp = new int[mat.length][mat[0].length];
      for(int i=0;i<mat.length;i++)
          for(int j=0;j<mat[0].length;j++)
              dp[i][j] = -1;

      // Compute longest path beginning from all cells
      for (int i=0; i<mat.length; i++)
      {
          for (int j=0; j<mat[0].length; j++)
          {
              if (dp[i][j] == -1)
                  findLongestFromACell(i, j, mat, dp);

              //  Update result if needed
              result = Math.max(result, dp[i][j]);
          }
      }

      return result;
  }
}
