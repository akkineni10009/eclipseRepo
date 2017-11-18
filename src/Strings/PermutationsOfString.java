package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfString {
  
  static Scanner sc = new Scanner(System.in);
  static String input;
  ArrayList<String> output = new ArrayList<String>();
  public static void main(String[] args)
  {
     System.out.println("Enter a String");
     input=sc.nextLine();
     permutationsOfString(input);
  }

  public static void permutationsOfString(String input)
  {
    int j=0;
    for(int i=input.length()-1;i>0;i--)
    {
      j=i-1;
      
    }
  }
}
