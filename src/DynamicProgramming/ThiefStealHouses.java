package DynamicProgramming;

import java.util.ArrayList;

public class ThiefStealHouses {
  static int[] input={1,10,2,3,7,4};
  
  public static void main(String[] args){
    ValuePath result=computeHousesToSteal();
    System.out.println(result.getValue());
    System.out.print(result.getPath());
    
    ValuePath result2=computeHousesToStealOptimized();
    System.out.println(result2.getValue());
    System.out.print(result2.getPath());
  }
  
  public static ValuePath computeHousesToSteal(){
    int length=input.length;
    ArrayList<ValuePath> list = new ArrayList<ValuePath>();
    
    if(length==0){
      return null;
    }
    
    if(length>=1){
      ValuePath vp = new ValuePath();
      vp.setValue(input[0]);
      vp.setPath(0);
      list.add(vp);
    }
    
    if(length>=2){
      ValuePath vp = new ValuePath();
      if(input[1]>input[0]){
        vp.setValue(input[1]);
        vp.setPath(1);
        }
      else{
        vp.setValue(input[0]);
        vp.setPath(0);
        }
      list.add(vp);
    }
    
    if(length>2){
      for(int i=2;i<length;i++){
        ValuePath vp = new ValuePath();
        if(input[i]+list.get(i-2).getValue() > list.get(i-1).getValue()){
          vp.setValue(input[i]+list.get(i-2).getValue());
          for(int temp:list.get(i-2).getPath()){
            vp.setPath(temp);
          }
          vp.setPath(i);
        }
        else{
           vp.setValue(list.get(i-1).getValue());
           for(int temp:list.get(i-1).getPath()){
            vp.setPath(temp);
           }
         }
        list.add(vp);
       }
    }
    return list.get(list.size()-1);
   }
  
  public static ValuePath computeHousesToStealOptimized(){
    int length=input.length;
    ValuePath value1 = new ValuePath();
    ValuePath value2 = new ValuePath();
    
    if(length==0){
      return null;
    }
   
    if(length>=1){
      value1.setValue(input[0]);
      value1.setPath(0);
    }
    
    if(length>=2){
      if(input[1]>input[0]){
        value2.setValue(input[1]);
        value2.setPath(1);
        }
      else{
        value2.setValue(input[0]);
        value2.setPath(0);
        }
    }
    
    if(length>2){
      for(int i=2;i<length;i++){
        ValuePath temp = new ValuePath();
        if(input[i]+value1.getValue() > value2.getValue()){
          temp.setValue(input[i]+value1.getValue());
          for(int k:value1.getPath()){
            temp.setPath(k);
          }
          temp.setPath(i);
        }
        else{
          temp.setValue(value2.getValue());
          for(int k:value2.getPath()){
            temp.setPath(k);
          }
          
        }
        value1=value2;
        value2=temp;
       }
    }
    return value2;
   }
}