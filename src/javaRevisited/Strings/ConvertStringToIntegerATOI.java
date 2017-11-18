package javaRevisited.Strings;

public class ConvertStringToIntegerATOI {
  static String input="8874319";
  
  public static void main(String[] args){
    convertStringToInteger();
  }
  
  public static void convertStringToInteger(){
    int result=0;
    for(int i=0;i<input.length();i++){
      result=(result*10)+input.charAt(i)-'0';
    }
    System.out.println(result);
  }
}
