package Goldman;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInstring {
    
    static String input="aabdbdc";
    public static void main(String[] args){
      firstUniqueCharacterInstring();
    }
    
    public static void firstUniqueCharacterInstring(){
      int length= input.length();
      Set<Character> set = new HashSet<Character>();
      
      for(int i=0;i<length;i++){
        char key=input.charAt(i);
        if(set.contains(key)){
           set.remove(key);
        }
        else{
          set.add(key);
        }
      }
      
      for(int i=0;i<length;i++){
        char key=input.charAt(i);
        if(set.contains(key)){
          System.out.println(key);
          break;
        }
      }
    }
}
