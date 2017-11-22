package Goldman;

public class MergeTwoSortedArrays {
  
  static int[] input1={1,3,6,7,8};
  static int[] input2={1,2,5,9};
  static int[] output= new int[input1.length+input2.length];
  
  public static void main(String[] args){
    mergeTwoSortedArrays();
    for(int i:output){
      System.out.println(i);
    }
  }
  
  public static void mergeTwoSortedArrays(){
    int i=0,j=0,k=0;
    for(;i<input1.length&&j<input2.length;k++){
      if(input1[i]<input2[j]){
         output[k]=input1[i];
         i++;
      }
      else{
        output[k]=input2[j];
        j++;
      }
    }
    if(i==input1.length){
      for(;j<input2.length;j++,k++){
        output[k]=input2[j];
      }
    }
    else{
      for(;i<input1.length;i++,k++){
        output[k]=input2[i];
      }
  }
 }
}