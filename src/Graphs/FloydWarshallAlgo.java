package Graphs;

public class FloydWarshallAlgo {

  final static int INF = 99999, V = 4;
  public static void main (String[] args)
  {
    int graph[][] = { {0,   5,  INF, 10},
        {INF, 0,   3, INF},
        {INF, INF, 0,   1},
        {INF, INF, INF, 0}};
    
    floydWarshall(graph);

  }
  
  public static void floydWarshall(int[][] graph)
  {
    int distance[][] = new int[V][V];
    for(int i=0;i<V;i++)
    {
      for(int j=0;j<V;j++)
      {
        distance[i][j]= graph[i][j];
      }
    }
    
    for(int k=0;k<V;k++) //For every intermediate vertex k
    {
    
      for(int i=0;i<V;i++) //For every source vertex
      {
        
        for(int j=0;j<V;j++) //For every destination vertex
        {
            if(distance[i][k]+distance[k][j]<distance[i][j])
              distance[i][j]=distance[i][k]+distance[k][j];
        }
        
      }
    
    }
    
    printfloydWarshall(distance);
  }
  
  public static void printfloydWarshall(int[][] distance)
  {
    for(int i=0;i<V;i++)
    {
      for(int j=0;j<V;j++)
      {
        System.out.print(distance[i][j] + "    ");
      }
      System.out.println();
    }
  }
}
