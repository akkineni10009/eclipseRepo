package javaRevisited.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceBlankWithOtherCharacter {
  static String input="Java is a very good programming language";
  
  public static void main(String[] args){
    String result=replaceBlankWithOtherCharacter();
    System.out.println(result);
  }
  
  public static String replaceBlankWithOtherCharacter(){
    int countOfSpaces=0,resultLength=0;;
    Character[] output;
    for(int i=0;i<input.length();i++){
      if(String.valueOf(input.charAt(i)).equals(" ")){
         countOfSpaces++;
      }
    }
    resultLength=input.length()+2*countOfSpaces;
    output = new Character[resultLength];
    
    for(int n=resultLength-1,m=input.length()-1; m>=0 && n>=0;m--){
      if(String.valueOf(input.charAt(m)).equals(" ")){
        output[n]='0';
        output[n-1]='2';
        output[n-2]='%';
        n=n-3;
      }
      else{
        output[n]=input.charAt(m);
        n--;
      }
    }
    return Arrays.toString(output);
  }
}