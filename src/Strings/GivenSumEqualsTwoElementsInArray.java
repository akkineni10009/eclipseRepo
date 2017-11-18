package Strings;

import java.util.HashSet;
import java.util.Set;

public class GivenSumEqualsTwoElementsInArray {
  public static void main(String[] args)
  {
    int[] input ={1,3,4,7,9,14,22};
    int sum=17;
    Set<Integer> set = new HashSet<Integer>();
    
    for(int i=0;i<input.length;i++)
    {
      if(set.contains(input[i]))
      {
        System.out.println("Two elements are "+ input[i] +" "+ (sum-input[i]));
      }
      else
      {
        set.add(sum-input[i]);
      }
    }
    
  }
}
