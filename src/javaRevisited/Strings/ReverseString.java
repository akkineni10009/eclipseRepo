package javaRevisited.Strings;

public class ReverseString {
  static String input="Akkineni";
  static StringBuffer sb=new StringBuffer();
  
  public static void main(String[] args){
    reverseString();
    input=sb.toString();
    for(int i=0;i<input.length();i++){
      System.out.println(input.charAt(i));
    }
    
    /*
     * Another method that can be used is directly call sb.reverse() 
    */
    reverseStringRecursion(input);
    temp();
  }
  
  public static void temp(){
    
  }
  
  public static void reverseString(){
    sb.append(input);
    for(int i=0,j=sb.length()-1;i<=j;i++,j--){
      swap(i,j); 
    }
  }
  
  public static void swap(int i,int j){
    char temp=sb.charAt(i);
    sb.setCharAt(i, sb.charAt(j));
    sb.setCharAt(j,temp);
  }
 
  public static String reverseStringRecursion(String input){
     
      if(input.length()<=1){
        return input;
      }
      return reverseStringRecursion(input.substring(1)+input.charAt(0));
  }
}