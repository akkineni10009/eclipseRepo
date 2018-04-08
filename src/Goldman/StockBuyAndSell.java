package Goldman;

import java.util.ArrayList;

public class StockBuyAndSell {
  // static int[] input={100,180,260,340,40,535,695};
  static int[] input={2,3,10,6,4,8,1};
  static ArrayList<StoreMinMax> list=new ArrayList<StoreMinMax>();
  public static void main(String[] args){
    // computeBuyAndSell();
    // printBuyAndSell();
    computeBuyAndSellOnce();
  }
  
  public static void computeBuyAndSell(){
    for(int i=0;i<input.length-1;i++){
      while(i<input.length-1 && input[i]>input[i+1]){
        i++;
      }
      StoreMinMax smm = new StoreMinMax();
      smm.setBuy(i++);
      while(i<input.length-1 && input[i]<input[i+1]){
        i++;
      }
      smm.setSell(i);
      list.add(smm);
    }
  }
  
  public static void printBuyAndSell(){
    for(int i=0;i<list.size();i++){
      System.out.println("Buy at "+list.get(i).getBuy()+" Sell at "+list.get(i).getSell());
    }
  }
  
  public static void computeBuyAndSellOnce(){
    int min=input[0],minIndex=0,maxDifference=Integer.MIN_VALUE,maxIndex=0;
    int globalMin=0;
    for(int i=1;i<input.length;i++){
      if(input[i]<min){
        min=input[i];
        minIndex=i;
      }
      if(input[i]-min>maxDifference){
        maxDifference=input[i]-min;
        maxIndex=i;
        globalMin=minIndex;
      }
    }
    System.out.println("Buy at "+globalMin+" Sell at "+ maxIndex);
    // System.out.println(maxDifference);
  }
}