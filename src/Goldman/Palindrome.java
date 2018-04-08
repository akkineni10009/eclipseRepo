package Goldman;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {
  
  static String input="abac";
  static Set<String> set = new HashSet<String>();
  public static void main(String[] args){
    int length=input.length();
    boolean result;
    for(int i=0;i<length;i++){
      for(int j=i;j<length;j++){
        String toBeAdded=input.substring(i,j+1);
        result=isPalindrome(i,j);
        if(result){
          set.add(toBeAdded);
        }
      }
    }
    System.out.println(set);
  }
  
  public static boolean isPalindrome(int m,int n){
    for(;m<=n;m++,n--){
      if(!(input.charAt(m)==input.charAt(n))){
        return false;
      } 
    }
    return true;
  }

}
