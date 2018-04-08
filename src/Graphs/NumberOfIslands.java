package Graphs;

public class NumberOfIslands {

  static int rows=0,columns=0;
  public static void main(String[] args) {
    int[][] graph = {
        {1, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 1}
       };
    rows=graph.length;
    columns=graph[0].length;
    boolean[][] visited = new boolean[rows][columns];
    int result=countIslands(graph,rows,columns,visited);
    System.out.println(result);
  }
  
  static int countIslands(int[][] graph,int r,int c,boolean[][] visited){
    int result=0; 
    for(int i=0;i<rows;i++){
       for(int j=0;j<columns;j++){
         if(isSafe(graph,i,j,visited)){
           dfs(graph,i,j,visited);
           result++;
         }
       }
     }
    return result;
  }
  
  static void dfs(int[][] graph,int r,int c,boolean[][] visited){
      int[] neighbourRows={-1,-1,-1,0,0,1,1,1};
      int[] neighbourColumns={-1,0,1,-1,1,-1,0,1};
      
      visited[r][c]=true;
      for(int k=0;k<8;k++){
        if(isSafe(graph,r+neighbourRows[k],c+neighbourColumns[k],visited)){
          dfs(graph,r+neighbourRows[k],c+neighbourColumns[k],visited);
        }
      }
  }
  
  static boolean isSafe(int[][] graph, int r,int c, boolean[][] visited){
    // System.out.println("Row is "+r+" Column is "+c+" ROWS "+rows+ " COLUMN "+columns);
    return (r>=0) && (r<rows) && (c>=0) && (c<columns) && (graph[r][c]==1 && !visited[r][c]);
  }
  
}