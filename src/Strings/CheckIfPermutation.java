package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CheckIfPermutation {

  public static void main(String args[])
  {
     //getCharactersCount();
     //boolean return_value=checkPermutation();
     //System.out.println(return_value);
     //boolean return_value2=checkPermutationSolution2();
     //System.out.println(return_value2);
     boolean return_value3=checkPermutationSolution3();
     System.out.println(return_value3);
  }

  private static void getCharactersCount() {
    String x="adbsasce";
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    
    for(int i=0;i<x.length();i++)
    {
      char key=x.charAt(i);
      if(!map.containsKey(key))
      {
        map.put(key,1);
      }
      else
      {
        int value=map.get(key);
        value=value+1;
        map.put(x.charAt(i),value); 
      }
    }
    for(char c: map.keySet())
    {
      System.out.print("Key is "+c);
      System.out.println(" Value is "+map.get(c));
    }
    //Iterator iterator =map.iterator();
  }
  
  public static boolean checkPermutation()
  {
    String x="abcde";
    String y="edacb";
    if(x.length()!=y.length())
    {
      return false;
    }
   
    char[] a= x.toCharArray();
    char[] b= y.toCharArray();
    /*
     *   Syntax for converting back to a String
     *   String m=String.valueOf(a);
         String n=String.valueOf(b); 
    */
    
    Arrays.sort(a);
    Arrays.sort(b);  
      
    for(int i=0;i<a.length;i++)
    {
      if(a[i]!=b[i])
      {
        return false;
      }
    }
    return true;
  }
  
  public static boolean checkPermutationSolution2()
  {
    String x="abcde";
    String y="ab";
    
    if(x.length()!=y.length())
    {
      return false;
    }
    HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
    HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
    
    for(int i=0;i<x.length();i++)
    {
      char key1=x.charAt(i);
      char key2=y.charAt(i);
      
      if(map1.get(key1)==null)
      {
        map1.put(key1, 1);
      }
      
      else
      {
        int value1=map1.get(key1);
        value1++;
        map1.put(key1,value1);
      }
      
      if(map2.get(key2)==null)
      {
        map2.put(key2, 1);
      }
      
      else
      {
        int value2=map2.get(key2);
        value2++;
        map2.put(key2,value2);
      }
    }
    
    for(char c:map1.keySet())
    {
      if(map1.get(c)!=map2.get(c))
      {
        return false;
      }
    }
    
    return true;
  }
  
  public static boolean checkPermutationSolution3()
  {
    String x="abcded";
    String y="abcdde";
    
    if(x.length()!=y.length())
    {
      return false;
    }
    
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for(int i=0;i<x.length();i++)
    {
      char key=x.charAt(i);
      if(map.get(key)==null)
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
    for(int i=0;i<y.length();i++)
    {
      char key=y.charAt(i);
      if(map.get(key)==null)
      {
        return false;
      }
      else
      {
        int value=map.get(key);
        value--;
        map.put(key, value);
      }
    }
    
    for(int c:map.values())
    {
      if(c!=0)
      {
        return false;
      }
    }
    
    return true;
  }
}