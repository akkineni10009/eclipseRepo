package DynamicProgramming;

public class OptimalGameStrategy {
  public static void main(String[] args) {
    int arr[] = {20, 30, 2, 2, 2, 10};
    int len = arr.length;
    int result = findMaxScore(arr, 0, len - 1);
    System.out.println(result);
    int resultDp = findMaxScoreDp(arr, 0, len );
    System.out.println(resultDp);
  }

  static int findMaxScore(int[] arr, int start, int end) {

    if (start > end) {
      return 0;
    }

    int chooseLeft = arr[start]
        + Math.min(findMaxScore(arr, start + 2, end), findMaxScore(arr, start + 1, end - 1));
    int chooseRight = arr[end]
        + Math.min(findMaxScore(arr, start, end - 2), findMaxScore(arr, start + 1, end - 1));

    return Math.max(chooseLeft, chooseRight);
  }

  static int findMaxScoreDp(int[] arr, int start, int end) {
    /*
     * Form an upper right triangle and return the last element in the first row
     * In first iteration only the center diagnol will be formed
     * In the second iteration all the elements one cell to the right of the diagnol will be formed 
     */
    int[][] dp = new int[end][end];
    int x = 0, y = 0, z = 0;
    for (int k = 0; k < end; k++) {
      for (int i=0,j = k; j < end; i++,j++) {
        x = (i + 2 <= j) ? dp[i + 2][j] : 0;
        y = (i + 1 <= (j - 1)) ? dp[i + 1][j - 1] : 0;
        z = (i <= (j - 2)) ? dp[i][j - 2] : 0;

        dp[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
      }
    }
    return dp[start][end-1];
  }
}
