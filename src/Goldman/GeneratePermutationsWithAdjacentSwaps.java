package Goldman;

public class GeneratePermutationsWithAdjacentSwaps {
  static String input="12345";
  static char[] inputArray=input.toCharArray();
  
  public static void main(String[] args){
    generatePermutationsWithAdjacentSwaps(0,input.length());
  }
  
  public static void generatePermutationsWithAdjacentSwaps(int start,int length){
    if(start>=length||start+1>=length){
      System.out.println(inputArray);
      return;
    }
    // Current index is not swapped
    generatePermutationsWithAdjacentSwaps(start+1,length);
    
    // Swap the ith element
    swap(start,start+1);
    generatePermutationsWithAdjacentSwaps(start+2,length);
    swap(start,start+1);
    
  }
  
  public static void swap(int i,int j){
    char temp=inputArray[i];
    inputArray[i]=inputArray[j];
    inputArray[j]=temp;
  }
}
