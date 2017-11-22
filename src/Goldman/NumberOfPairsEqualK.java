package Goldman;

import java.util.HashSet;
import java.util.Set;

public class NumberOfPairsEqualK {

  static int[] input={3,4,9,1,12,2,5,7,8,6};
  public static void main(String[] args){
    numberOfPairsEqualK(14);
  }
  
  public static void numberOfPairsEqualK(int k){
    Set<Integer> set = new HashSet<Integer>();
    int count=0;
    
    for(int i=0;i<input.length;i++){
      if(set.contains(input[i])){
        count++;
        System.out.println("Pairs are "+ input[i] + " and " + (k-input[i]));
      }
      else{
        set.add(k-input[i]);
      }
    }
    System.out.println("Count are"+count);
  }
}