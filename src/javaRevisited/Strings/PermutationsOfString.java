package javaRevisited.Strings;

public class PermutationsOfString {

  static String input="ABC";
  public static void main(String[] args){
    permutations(input,0,input.length()-1);
  }
  
  public static void permutations(String input, int left, int right){
    
    if(left==right){
      System.out.println(input);
      }
    else{
      for(int i=left;i<=right;i++){
        input=swap(input,left,i);
        permutations(input,left+1,right);
        input=swap(input,left,i);
         
      }
    }
  }
  
  public static String swap(String input,int i, int j){
     char temp=input.charAt(i);
     char[] toChar = input.toCharArray();
     toChar[i]=toChar[j];
     toChar[j]=temp;
     return String.valueOf(toChar);
         
  }
}
