package Strings;

import java.util.HashMap;

public class EggBake {
  
  public static void main(String[] args)
  {
      HashMap<String,Integer> ingredients = new HashMap<String,Integer>();
      ingredients.put("Floor",3);
      ingredients.put("Sugar",2);
      ingredients.put("Eggs",5);
      HashMap<String,Integer> items = new HashMap<String,Integer>();
      items.put("Floor", 90);
      items.put("Sugar", 80);
      items.put("Eggs", 150);
      compute(ingredients,items);
  }
  
  public static void compute(HashMap<String,Integer> ingredient,HashMap<String,Integer> item)
  {
    int minTotal=Integer.MAX_VALUE,current_min=0;
    int val1=0,val2=0;
    
    for(String key:item.keySet())
    {
      val1=item.get(key);
      val2=ingredient.get(key);
      current_min=val1/val2;
      if(current_min<=minTotal)
      {
        minTotal=current_min;
      }
    }
    
    System.out.println(minTotal);
  }
}
