package Graphs;

public class ShortestPathDijikstra {

  public static void main (String[] args)
  {
      /* Let us create the example graph discussed above */
     int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                {0, 0, 2, 0, 0, 0, 6, 7, 0}
                               };
      ShortestPathDijikstra t = new ShortestPathDijikstra();
      t.dijkstra(graph, 0);
  }
  
  public void dijkstra(int[][] graph, int source)
  {
    int[] distance = new int[graph.length];
    boolean[] selectedvertices = new boolean[graph.length];
    
    for(int i=0;i<graph.length;i++)
    {
      selectedvertices[i]=false;
      distance[i]=Integer.MAX_VALUE;
    }
    
    distance[source]=0;
    
    for(int i=0;i<distance.length;i++)
    {
      int minIndex= minimumDistanceIndex(distance, selectedvertices);
      selectedvertices[minIndex]=true; 
      
      for(int v=0;v<distance.length;v++)
      {
        if(!selectedvertices[v] && graph[minIndex][v]!=0 && distance[minIndex]+graph[minIndex][v]<distance[v])
        {
          distance[v]= distance[minIndex]+graph[minIndex][v];
        }
      }
      
    }
    printGraph(distance);
  }
  
  public static int minimumDistanceIndex(int[] distance, boolean[] selectedvertices)
  {
    int minIndex=0;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<distance.length;i++)
    {
      if(!selectedvertices[i] && distance[i]<=min)
      {
        min=distance[i];
        minIndex=i;
      }
    }
    return minIndex;
  }
  
  public static void printGraph(int[] distance)
  {
    for(int i=0;i<distance.length;i++)
    {
      System.out.println(distance[i]);
    }
  }
}
