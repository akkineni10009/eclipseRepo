package javaRevisited.Strings;

import java.util.TreeMap;

public class PrintDuplicateCharacters {
  static String input="Akkineni";
  
  public static void main(String[] args){
    printDuplicateCharacters();
  }
  
  public static void printDuplicateCharacters(){
    TreeMap<Character,Integer> map= new TreeMap<Character,Integer>(); 
    char key;
    int value;
    
    if(input.equals(null) || input.isEmpty()){
      System.out.println("Please enter a valid string");
    }
    
    for(int i=0;i<input.length();i++){
      key=input.charAt(i);
      if(!map.containsKey(key)){
        map.put(key,1);
      }
      else{
        value=map.get(key);
        value++;
        map.put(key, value);
      }
         
    }
    
    for(char keyPrint:map.keySet()){
      if(map.get(keyPrint)>1){
        System.out.println(keyPrint+" ");
      }
    }  
  }
}
