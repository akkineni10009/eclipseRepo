
public class ThiefStealHouse {

  public static void main(String[] args) {
      int[] input = {100,1,2,200,10};
      System.out.println(thiefSteal(input,4));
  }
  static int thiefSteal(int[] input, int n){
    if(n<=0){
      return 0;
    }
    if(n==1){
      return input[0];
    }
    if(n==2){
      return Math.max(input[0], input[1]);
    }
    
    return Math.max(input[n-1]+thiefSteal(input,n-2), thiefSteal(input,n-1));
  }
}
