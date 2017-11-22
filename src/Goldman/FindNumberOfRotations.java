package Goldman;

public class FindNumberOfRotations {
  static int[] input={11,13,15,8,9,10};
  public static void main(String[] args){
    findNumberOfRotations();
  }
  
  public static void findNumberOfRotations(){
    int rotate=0;
    int length=input.length;
    if(length<=1){
      System.out.println(0);
      return;
    }
    
    for(int i=1;i<input.length;i++){
      if(input[i]<input[i-1]){
        rotate=i;
        break;
      }
    }
    rotate=input.length-rotate;
    System.out.println(rotate);
  }
   
}
