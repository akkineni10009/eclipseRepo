package javaRevisited.Strings;

public class ReverseWordsInString {
  static String input="Ajay is a good guy";
  public static void main(String[] args){
    reverseWords(input);
  }
  
  public static void reverseWords(String s) {
    String[] inputArray = s.split("\\s+");
    StringBuffer sb = new StringBuffer();
    for(int i=inputArray.length-1;i>=0;i--){
        sb.append(inputArray[i] + " ");
    }
    System.out.println(sb.toString().trim());
}
}
