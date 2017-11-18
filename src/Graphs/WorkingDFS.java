package Graphs;

import java.util.Stack;

public class WorkingDFS {

  public static void main(String[] args) {
    int[][] matrix = {
            // 1 2 3 4 5 6 7 8 9 10
            { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 }, // 1
            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, // 2
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 3
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 4
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, // 5
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 6
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 }, // 7
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 8
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 9
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } // 10
    };
    boolean [] visited = new boolean[10];

    dfs(0, matrix, visited);
  }
  
  public static void dfs(int i, int[][] matrix, boolean[] visited) {
    // DFS can also be used to detect a cycle in the graph
    // If we reach a vertex that is already in the recursion stack, then there is a cycle in the tree 
  
    Stack<Integer> stack = new Stack<Integer>();
    stack.add(i);
    visited[i]=true;
    System.out.println(i);
    
    while(!stack.isEmpty())
    {
      int element=stack.peek();
      int j=0;
      while(j<matrix.length)
      {
        if(matrix[element][j]==1 && !visited[j])
        {
          stack.add(j);
          visited[j]=true;
          System.out.println(j);
          // Add all the adjacent vertices to the stack 
          element=j;
          j=0;
          
          //break;
        }
        j++;
      }
      // Once it reaches a dead end it backtracks i.e the pop operation is performed on the stack 
      stack.pop();
    }
  }
  
}
