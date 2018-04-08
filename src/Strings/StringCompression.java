package Strings;

import java.util.HashMap;

public class StringCompression {
  
  static String output="";
  static String input="aaabbcaaddd";
  static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
  
  public static void main (String[] args)
  {
    stringCompression2();
  }

  public static void stringCompression()
  {
    for(int i=0;i<input.length();i++)
    {
      int count=1;
      char key= input.charAt(i);
      char next=0;
      if(i+1<input.length())
        next=input.charAt(i+1);
      while(next==key && i+1<input.length())
      {
        i++;
        if(i+1<input.length())
          next=input.charAt(i+1);
        count++;
      }
      output=output+String.valueOf(key)+ String.valueOf(count);
    }
    
    System.out.println(output);
  }
  
  public static void stringCompression2()
  {
    char testItem =input.charAt(0);
    char key = 0;
    int count=1;
    int i=1;
    
    for(;i<input.length();i++)
    {
      
      key= input.charAt(i);
      if(key==testItem)
      {
        count++;
      }
      
      else
      {
        output+=testItem+String.valueOf(count);
        count=1;
      }
      
      testItem=key;
    }
    if(i==input.length())
    {
      output+=key+String.valueOf(count);
    }
    
    System.out.println(output);
  }
}
