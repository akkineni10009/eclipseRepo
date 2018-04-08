package Stacks;

import java.util.Stack;

public class MinimumInStackConstantTime {
  static Stack<Integer> stack = new Stack<Integer>();
  static Stack<Integer> auxStack = new Stack<Integer>();

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    popElement();
    pushElement(2);
    pushElement(4);
    pushElement(3);
    pushElement(1);
    pushElement(5);
    System.out.println(getMinElement());
    popElement();
    popElement();
    System.out.println(getMinElement());
    pushElement(0);
    System.out.println(getMinElement());
  }

  static int getMinElement() {
    return auxStack.peek();
  }

  static void pushElement(int x) {
    stack.push(x);
    if (auxStack.isEmpty()) {
      auxStack.push(x);
      return;
    }
    if (x <= auxStack.peek()) {
      auxStack.push(x);
    }
  }

  static int popElement() {
    if (stack.isEmpty()) {
      try {
        throw new Exception();
      } catch (Exception e) {
        // e.printStackTrace();
        System.out.println("Cannot pop from empty stack"+e);  
      }
    }
    if (auxStack.peek() == stack.peek()) {
      auxStack.pop();
    }
    return stack.pop();
  }
}
