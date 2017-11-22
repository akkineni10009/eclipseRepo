package Goldman;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
  static String input="{[]98()}";
  public static void main(String[] args){
    validParanthesis();
  }
  
  public static void validParanthesis(){
    Stack<Character> stack = new Stack<Character>();
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');
    int length=input.length();
    
    for(int i=0;i<length;i++){
      char key= input.charAt(i);
      
      if(key=='{' || key=='[' || key=='('){
        stack.push(key);
      }
      
      else if(key==')' || key=='}' || key==']'){
        if(!stack.isEmpty() && key==map.get(stack.peek())){
          stack.pop();
        }
      }
    }
    if(stack.isEmpty()){
      System.out.println("Valid paranthesis");
    }
    else{
      System.out.println("Invalid paranthesis");
    }
  }
}
