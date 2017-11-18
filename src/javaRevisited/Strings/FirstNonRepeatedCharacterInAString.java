package javaRevisited.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatedCharacterInAString {
  /*
   * Method-1
   * Simple approach would be to iterate the string from left to right and keep track of the count of the characters
   * in a HashMap. Again, iterate over the string from left to right, each character would be a key in the hashMap.
   * Get the value corresponding to this vale and return the key if value is =1
   * Method-2
   * Computing the result in one iteration, but using another data structure. Trade off between space and time.
   * Maintain a set of repeating characters and an ArrayList of non-repeating characters. Iterate each character 
   * and check if it is present in repeating then continue. otherwise, if it is there in non-repeating, remove it
   * from there and put it in repeating. if it is not there in non-repeating,insert it there
   */
  static String input = "aabbcddae";
  
  public static void main(String[] args){
    firstNonRepeatedCharacterInAString();
  }
  
  public static void firstNonRepeatedCharacterInAString(){
    Set<Character> repeated = new HashSet<Character>();
    ArrayList<Character> nonrepeated = new ArrayList<Character>();
    char key;
    
    for(int i=0;i<input.length();i++){
      key=input.charAt(i);
      if(repeated.contains(key)){
         continue;
      }
      if(nonrepeated.contains(key)){
         nonrepeated.remove((Character) key); 
         //We pass the index here. if we don't type cast it gets the ASCII value of character in 'key'
         //In order to remove the character, type cast
         repeated.add(key); 
      }
      else{
        nonrepeated.add(key);
      }
    }
    if(!nonrepeated.isEmpty()){
      System.out.println(nonrepeated.get(0));
    }
    else{
      System.out.println("There is no non repeating character");
    }
  }
}
