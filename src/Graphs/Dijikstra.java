package Graphs;

public class Dijikstra {

  static int graph[][] = new int[][]{
    {0, 4, 0, 0, 0, 0, 0, 8, 0},
    {4, 0, 8, 0, 0, 0, 0, 11, 0},
    {0, 8, 0, 7, 0, 4, 0, 0, 2},
    {0, 0, 7, 0, 9, 14, 0, 0, 0},
    {0, 0, 0, 9, 0, 10, 0, 0, 0},
    {0, 0, 4, 14, 10, 0, 2, 0, 0},
    {0, 0, 0, 0, 0, 2, 0, 1, 6},
    {8, 11, 0, 0, 0, 0, 1, 0, 7},
    {0, 0, 2, 0, 0, 0, 6, 7, 0} 
  };
   
  static int[] distance = new int[graph.length];
  static boolean[] visited= new boolean[graph.length];
   
  public static void main (String[] args)
  {
      dijkstra(graph, 0);
      printGraph();
  }
  
  public static void dijkstra(int[][] graph, int source)
  {
    for(int i=0;i<graph.length;i++)
    {
      distance[i]=Integer.MAX_VALUE;
      visited[i]=false;
    }
    
    distance[source]=0;
    
    for(int i=0;i<graph.length;i++)
    {
      int minIndex=findMinIndex();
      visited[minIndex]=true;
      
      for(int v=0;v<graph.length;v++)
      {
        if(!visited[v] && graph[minIndex][v]!=0 && distance[minIndex]+graph[minIndex][v]<distance[v])
        {
          distance[v]=distance[minIndex]+graph[minIndex][v];
        }
      }
    }
  }
  
  public static int findMinIndex()
  {
    int minIndex=0;
    int min=Integer.MAX_VALUE;
    
    for(int i=0;i<graph.length;i++)
    {
      if(!visited[i] && distance[i]<min)
      {
        min=distance[i];
        minIndex=i;
      }
    }
    return minIndex;
  }
  
  public static void printGraph()
  {
    for(int i=0;i<graph.length;i++)
    {
      System.out.println(distance[i]);
    }
  }
}