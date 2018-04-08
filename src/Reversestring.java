
public class Reversestring {

  public static void main(String[] args) {
    System.out.println(reverse("abcd",4));
  }
  static String reverse(String input,int index){
    if(index==0){
      return "";
    }
    return input.charAt(index-1)+reverse(input,index-1);
  }   
}
