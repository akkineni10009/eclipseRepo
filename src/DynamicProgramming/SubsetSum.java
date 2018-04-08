package DynamicProgramming;

public class SubsetSum {

  public static void main(String[] args) {
    int arr[] = {3, 34, 4, 12, 5, 2};
    int n = arr.length;
    System.out.println(findSubsetSum(arr, n, 0, 89));
    System.out.println(findSubsetSumDp(arr, n, 0, 9));
  }

  static boolean findSubsetSum(int[] arr, int n, int currentSum, int requiredSum) {
    if (n <= 0) {
      return false;
    }

    if (currentSum == requiredSum) {
      return true;
    }

    return findSubsetSum(arr, n - 1, currentSum + arr[n - 1], requiredSum)
        || findSubsetSum(arr, n - 1, currentSum, requiredSum);
  }

  static boolean findSubsetSumDp(int[] arr, int n, int currentSum, int requiredSum) {
    boolean[][] dp = new boolean[n + 1][requiredSum + 1];
    // Chance for sum=0 when we have elements is always true
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = true;
    }

    // When we have 0 elements we cannot get any sum
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i] = false;
    }

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        // If the element is not included
        dp[i][j] = dp[i - 1][j];

        // If the element is included
        if (arr[i - 1] <= j) {
          dp[i][j] |= dp[i - 1][j - arr[i-1]];
        }

      }
    }
    return dp[n][requiredSum];
  }
}
