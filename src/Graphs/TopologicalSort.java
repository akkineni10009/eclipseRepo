package Graphs;

import java.util.Stack;

public class TopologicalSort {

  static int[][] matrix = {
      { 0, 0, 0, 0, 0, 0}, // 0
      { 0, 0, 0, 0, 0, 0}, // 1
      { 0, 0, 0, 1, 0, 0}, // 2
      { 0, 1, 0, 0, 0, 0}, // 3
      { 1, 1, 0, 0, 0, 0}, // 4
      { 1, 0, 1, 0, 0, 0}, // 5
  };
  
  static boolean[] visited = new boolean[matrix.length];
  static Stack<Integer> result_stack=new Stack<Integer>();
  
  public static void main(String[] args) {
    topologicalSort();
  }
  
  public static void topologicalSort()
  {
     for(int i=0;i<matrix.length;i++)
     {
       if(visited[i]==false)
          dfs(i);
       
     }
     printResultStack();
  }
  
  public static void dfs(int i)
  {
    Stack<Integer> stack = new Stack<Integer>();
    
    
    visited[i]=true;
    stack.add(i);
    
    while(!stack.isEmpty())
    {
      int element=stack.peek();
      for(int k=0;k<matrix.length;k++)
      {
        if(matrix[element][k]==1 && !visited[k])
        {
          stack.add(k);
          visited[k]=true;
          element=k;
          k=0;
        }
      }
      result_stack.add(element); 
      stack.pop();
    }
  }
  
  public static void printResultStack()
  {
    while(!result_stack.isEmpty())
    {
      System.out.println(result_stack.pop());
    }
  }
}
