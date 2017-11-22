package javaRevisited.Strings;

public class CheckValidShuffle {
  static String input1="abc";
  static String input2="def";
  static String input3="dabecf";
  
  public static void main(String[] args){
    boolean result=checkValidShuffle(input1,input2,input3);
    System.out.println(result);
  }
  
  public static boolean checkValidShuffle(String input1, String input2, String input3){
    if(!(input1.length()+input2.length()==input3.length())){
      return false;
    }
    
    for(int i=0,j=0,k=0;k<input3.length();k++){
      if(i<input1.length() && input3.charAt(k)==input1.charAt(i)){
        i++;
      }
      
      else if(j<input2.length() && input3.charAt(k)==input2.charAt(j)){
        j++;
      }
      
      else{
        return false;
      }
    }
    
    return true;
    
  }
}
