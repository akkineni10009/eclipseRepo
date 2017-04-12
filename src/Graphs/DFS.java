package Graphs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
  
  public static int[][] graph;
  public static int[] nodes;
  public static boolean[] visited;
  public static int nodeCount=0,edgeCount=0;
  public static String edge="";
  static HashMap<Integer,Integer> vertexMapping = new HashMap<Integer,Integer>();
  
  public static void main(String[] args)
  {
    
    initializeGraph();
    Scanner sc= new Scanner(System.in);
    
    int vertexCount=0;
    System.out.println("Enter the number of nodes");
    nodeCount=sc.nextInt();
    graph = new int[nodeCount][nodeCount];
    nodes=new int[nodeCount];
    visited = new boolean[nodeCount];
    
    System.out.println("Enter the vertices");
    for(int i=0;i<nodeCount;i++)
    {
      nodes[i]=sc.nextInt();
    }
    
    System.out.println("Enter the number of edges");
    edgeCount=sc.nextInt();
    
    String[] getEdge = new String[2*edgeCount];
    for(int i=0;i<2*edgeCount;i++)
    {
      getEdge[i]="0";
    }
    int currentCount=0;
    
    for(int i=0;i<edgeCount;i++)
    {
      System.out.println("Enter the edges between the nodes by giving space in between: Assuming nodes start from 0");
      edge=sc.next();
      //edge=sc.nextLine();
      
      for(String e:edge.split(" "))
      {
        getEdge[currentCount++]=e;
        System.out.println(getEdge[currentCount]);
      }
    }
    
    for(int i=0;i<getEdge.length;i=i+2)
    {
      graph[Integer.parseInt(getEdge[i])][Integer.parseInt(getEdge[i+1])]=1;
      graph[Integer.parseInt(getEdge[i+1])][Integer.parseInt(getEdge[i])]=1;
    }
    
    printGraph();
    //dfs();
  }
  
  public static void dfs()
  {
    Stack<Integer> dfsStack = new Stack<Integer>();
    for(int i=0;i<nodeCount;i++)
    {
      //dfsStack.push();
    }
  }
  
  public static void printGraph()
  {
    for(int i=0;i<nodeCount;i++)
    {
      for(int j=0;j<nodeCount;j++)
      {
        System.out.print(graph[i][j]);
      }
      System.out.println("");
    }
  }

  public static void initializeGraph()
  {
    for(int i=0;i<nodeCount;i++)
    {
      for(int j=0;j<nodeCount;j++)
      {
        graph[i][j]=0;
      }
    }
  }
}
