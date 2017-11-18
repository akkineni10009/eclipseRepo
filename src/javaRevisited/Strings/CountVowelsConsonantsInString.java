package javaRevisited.Strings;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsConsonantsInString {
    static String input="Akkineni";
    
    public static void main(String[] args){
      countVowelsConsonantsInString();
    }
    
    public static void countVowelsConsonantsInString(){
      int vowelCounter=0,consonantCounter=0;
      Set<Character> vowels= new HashSet<Character>();
      vowels.add('a');
      vowels.add('e');
      vowels.add('i');
      vowels.add('o');
      vowels.add('u');
      
      for(int i=0;i<input.length();i++){
        if(vowels.contains(input.charAt(i))){
          vowelCounter++;
        }
        else{
          consonantCounter++; 
        }
      }
      
      System.out.println(vowelCounter +" Number of vowels");
      System.out.println(consonantCounter +" Number of Consonants");
    }
}
