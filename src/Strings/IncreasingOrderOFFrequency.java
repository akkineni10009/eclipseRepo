package Strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class IncreasingOrderOFFrequency {

  public static void main(String[] args)
  {
    int[] arr={1,3,1,5,2,1,4,4,2};
    int length=arr.length;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i=0;i<length;i++)
    {
      int key=arr[i];
      if(map.get(key)!=null)
      {
        int value=map.get(key);
        value++;
        map.put(key, value);
      }
      else
      {
        map.put(key, 1);
      }
    }
    
    class MyComparator implements Comparator<Integer>
    {
      
      HashMap<Integer,Integer> CurrentMap;
      MyComparator(HashMap<Integer,Integer> current)
      {
        CurrentMap=current;
      }
      
      @Override
      public int compare(Integer key1,Integer key2)
      {
        
        Integer value1=CurrentMap.get(key1);
        Integer value2=CurrentMap.get(key2);
        
        int num=value1.compareTo(value2);
        
        return num==0?key1.compareTo(key2):num; 
      }
    }
    
    MyComparator mycomp = new MyComparator(map);
    TreeMap<Integer,Integer> treemap=new TreeMap<Integer,Integer>(mycomp);
    treemap.putAll(map);
    
    for(int i: treemap.keySet())
    {
      int freq=treemap.get(i);
      for(int k=0;k<freq;k++)
      {
        System.out.println(i);
      }
    }
  }
}
