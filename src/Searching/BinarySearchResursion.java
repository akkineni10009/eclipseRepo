package Searching;

public class BinarySearchResursion {

  private static int[] input = {99, 10, 25, 32, 63, 67};
  private static int mid = 0;

  BinarySearchResursion() {

  }

  public static void main(String[] args) {

    System.out.println("Helo");
    // System.out.println(binarySearch(0,input.length-1,67));
    System.out.println(binarySearchRecursion(0, input.length - 1, 67));

  }

  private static boolean binarySearch(int start, int end, int value) {
    int mid = 0;

    while (start <= end) {

      mid = (start + end) / 2;
      if (value == input[mid]) {
        return true;
      }

      else if (value > input[mid]) {
        start = mid + 1;

      } else if (value < input[mid]) {
        end = mid - 1;
      }

    }

    return false;
  }

  private static boolean binarySearchRecursion(int start, int end, int value) {
    if(start<=end){
      mid = (start + end) / 2;

      if (value == input[mid]) {
        return true;
      }


      else if (value < input[mid]) {
        return binarySearchRecursion(start, mid - 1, value);
      }

      else {
        return binarySearchRecursion(mid + 1, end, value);
      }

    }
    else {
      return false;
    }
  }

  private static int minInSortedRotatedArray() {

    return 0;
  }
}

