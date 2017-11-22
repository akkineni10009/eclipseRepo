package javaRevisited.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInString {
  static String input="Ajayisagoodguy";
  public static void main(String[] args){
    removeDuplicateCharactersInString(input);
  }
  
  public static void removeDuplicateCharactersInString(String input) {
    Set<Character> set = new HashSet<Character>();
    StringBuilder sb= new StringBuilder();
    for(int i=0;i<input.length();i++){
      set.add(input.charAt(i));
    }
    
    for(char s:set){
      sb.append(s);
    }
    
    System.out.println(sb.toString());
  }
}
