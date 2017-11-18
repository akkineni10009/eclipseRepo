package Stacks;

import java.util.Stack;

public class BalancingSymbols {
  static String arr="({)}";
  static int length=arr.length();
  static Stack<Character> stack =new Stack<Character>();

  public static void main(String[] args)
  {
    boolean result=isBalanced();
    System.out.println(result);
  }
  
  public static boolean isBalanced()
  {
    for(int i=0;i<length;i++)
    {
      
      if(arr==null || length==0)
      {
          return true;
      }
      
      else if(arr.charAt(i)=='(' || arr.charAt(i)=='{')
      {
        stack.push(arr.charAt(i));
      }
      
      else if(arr.charAt(i)==')')
       {
       if(!stack.isEmpty() && stack.peek()=='(')
        {
          stack.pop();
        }
        else
        {
          return false;
        }
          
      }
      
      else if(arr.charAt(i)=='}')
      {
        if(!stack.isEmpty() && stack.peek()=='{')
        {
          stack.pop();
        }
        else
        {
          return false;
        }
      }
    }
   // System.out.println("Hello"+stack.size());
    return stack.isEmpty();
  }
}
