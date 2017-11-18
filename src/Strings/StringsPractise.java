package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StringsPractise {

  public static void main(String[] args)
  {
    /*String m= "acd d    ";
    char[] a =m.toCharArray();
    m=String.valueOf(a);
    
    String m2=m.replaceAll("\\s","");
    
    String input = "aabbccdaabb";
    int length=input.length();
    
    int charactercount=0;
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<length;i++)
    {
        charactercount++;
        if(i+1>=length || input.charAt(i)!=input.charAt(i+1))
        {
           sb.append(input.charAt(i));
           sb.append(charactercount);
           charactercount=0;
        }
    }
    
    System.out.println(sb);*/
    //getCharacterCount();
    //checkPermutation();
    List<Integer> list = new LinkedList<Integer>();
    list.add(4);
    list.add(16);
    list.add(1);
    list.add(3);
    list.remove(0);
    
    for(int i=0;i<list.size();i++)
    {
      System.out.println(list.get(i));
    }
    
  }
  
  public static void getCharacterCount()
  {
    String input="assdcedrfsa";
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    int length=input.length();
    
    for(int i=0;i<length;i++)
    {
      char key=input.charAt(i);
      if(!map.containsKey(key))
      {
        map.put(key, 1);
      }
      else
      {
        int value=map.get(key);
        value++;
        map.put(key, value);
      }
    }
    
    for(char c: map.keySet())
    {
      System.out.println("Key is "+c+" Value is "+map.get(c));
    }
  }
  
  public static void checkPermutation()
  {
    String x="aaaabbcde";
    String y="edacb";
   
    HashMap<Character,Integer> map= new HashMap<Character,Integer>();
   
    for(int i=0;i<x.length();i++)
    {
      char key=x.charAt(i);
      if(!map.containsKey(key))
      {
        map.put(key, 1);
      }
      else
      {
        int value=map.get(key);
        value++;
        map.put(key, value);
      }
    }
    
    for(int i:map.keySet())
    {
      System.out.println(i);
    }
  }
}
