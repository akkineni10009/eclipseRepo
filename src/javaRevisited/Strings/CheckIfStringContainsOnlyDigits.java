package javaRevisited.Strings;

public class CheckIfStringContainsOnlyDigits {

static String input = "8786876jhgjg";
  
  public static void main(String[] args){
    boolean result=checkIfStringContainsOnlyDigits();
    System.out.println(result);
  }
  
  public static boolean checkIfStringContainsOnlyDigits(){
    if(input.equals(null) || input.isEmpty()){
      return false;
    }
    
    if(input.matches("[0-9]+")){
      return true;
    }
    
    /*
     * We can also do input.contains("[a-zA-Z]+") returns false. Means if there is any 
     * non-numeric character return false
     * Refer to http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
     */
    return false;
  }
}
