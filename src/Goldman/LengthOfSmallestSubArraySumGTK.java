package Goldman;

public class LengthOfSmallestSubArraySumGTK {
  /*
   * Identify the size of minimal subset whose sum is greater than 'k'
   */
  static int[] input={1,2,8,3,6,9,3};
  public static void main(String[] args){
    lengthOfSmallestSubArraySumGTK(15);
  }
  
  public static void lengthOfSmallestSubArraySumGTK(int k){
    int length=input.length;
    int sum=0,min_size=Integer.MAX_VALUE,current_min=0;
    for(int i=0;i<length;i++){
      for(int j=i;j<length;j++){
        sum=sum+input[j];
        if(sum>=k){
          current_min=j-i+1;
          if(current_min<min_size){
            min_size=current_min;
          }
        }
      }
      sum=0;
    }
    System.out.println(min_size);
  }
}
