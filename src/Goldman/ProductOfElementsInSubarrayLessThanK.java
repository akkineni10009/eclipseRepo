package Goldman;

public class ProductOfElementsInSubarrayLessThanK {
  static int[] input={1,2,3};
  public static void main(String[] args){
    productOfElementsInSubarrayLessThanK(4);
  }
  
  public static void productOfElementsInSubarrayLessThanK(int k){
    int length=input.length;
    int product=1,count=0;
    for(int i=0;i<length;i++){
      for(int j=i;j<length;j++){
        product=product*input[j];
        if(product<=k){
          count++;
        }
      }
      product=1;
    }
    System.out.println(count);
  }
}
