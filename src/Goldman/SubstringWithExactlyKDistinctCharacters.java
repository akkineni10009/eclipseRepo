package Goldman;

import java.util.Arrays;

public class SubstringWithExactlyKDistinctCharacters {
  static String input="aa";
  public static void main(String[] args){
    substringWithExactlyKDistinctCharacters(1);
  }
  
  public static int substringWithExactlyKDistinctCharacters(int k){
    int[] map=new int[26];
    int result=0;
    int length=input.length();
    
    for(int i=0;i<length;i++){
      int distinct_count=0;
      Arrays.fill(map,0);
      
      for(int j=i;j<length;j++){
        int index=input.charAt(j)-'a';
        if(map[index]==0){
          distinct_count++;
        }
        map[index]++;
        if(distinct_count==k){
          result++;
        }
      }
    }
    System.out.println(result);
    return result;
  }
   
}
