
public class FizzBizz {

  public static void main(String[] args) {
    // Refer to J unit
  }
  public String fizzBizz(int number){
    StringBuilder sb = new StringBuilder();
    if(number%3==0){
      sb.append("Fizz ");
    }
    if(number%5==0){
      sb.append("Buzz");
    }
    if((number%3)!=0 && (number%5)!=0){
      sb.append(number);
    }
    return sb.toString().trim();
  }
}
