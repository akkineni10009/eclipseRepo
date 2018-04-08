package javaRevisited.Strings;

public class CheckIfStringContainsAnotherString {
  
  static String m="abcdefabfcdeabc";
  static String n="abf";
  public static void main(String[] args){
    checkIfStringContainsAnotherString();
  }
  
  public static void checkIfStringContainsAnotherString(){
    int count=0;
    for(int i=0,j=0;i<m.length() && j<n.length();i++){
      if(m.charAt(i)==n.charAt(j)){
        count++;
        if(count==n.length()){break;} // Found the sub string
        j++;
      }
      else{
        j=0;
        count=0;
      }
    }
    if(count==n.length()){
      System.out.println("Contains a substring");
    }
    else{
      System.out.println("No substring");
    }
  }
}
