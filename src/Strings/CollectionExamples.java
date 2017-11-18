package Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class CollectionExamples {
 
  static String arr="122992313575";
  public static void main(String[] args)
  {
    
    int length=arr.length();
    Set<Character> set= new HashSet<Character>();
    for(int i=0;i<arr.length();i++)
    {
      set.add(arr.charAt(i));
    }
    
    for(char c:set)
    {
       //System.out.println(c);
    }
    
    Iterator iter=set.iterator();
    while(iter.hasNext())
    {
      char value= (char) iter.next();
     // System.out.println(value);
    }
    
    TreeMap<Character,Integer> treemap= new TreeMap<Character,Integer>();
    for(int i=0;i<length;i++)
    {
      char key=arr.charAt(i);
      if(treemap.containsKey(key))
      {
        int value=treemap.get(key);
        treemap.put(key, value+1);
      }
      
      else
      {
        treemap.put(key,1);
      }
      
    }
    
    for(char temp : treemap.keySet())
    {
      System.out.println(treemap.get(temp));
    }
    
   // sortUsingComparator();
    
  }
  
  public static void sortUsingComparator()
  {
    List<Integer> list = new LinkedList<Integer>();
    list.add(4);
    list.add(16);
    list.add(1);
    list.add(3);
    list.remove("16");
    for(int i=0;i<list.size();i++)
    {
      System.out.println(list.get(i));
    }
    
    Iterator iter=list.listIterator();
    System.out.println("Before sort ");
    while(iter.hasNext())
    {
      int value=(int) iter.next();
      System.out.println(value);
    }
    
    Collections.sort(list, new SortComparator());
    System.out.println(list);
  }

}