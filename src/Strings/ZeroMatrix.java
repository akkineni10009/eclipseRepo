package Strings;

import java.util.ArrayList;

public class ZeroMatrix {
  
  public static int[][] arr = {{1,1,1},{1,1,1},{1,1,0}};
  static ArrayList<Integer> zerorow = new ArrayList<Integer>();
  static ArrayList<Integer> zerocolumn = new ArrayList<Integer>();
  static int rows=arr.length;
  static int columns=arr[0].length;
  
  public static void main(String args[])
  {
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<columns;j++)
      {
        if(arr[i][j]==0)
        {
          zerorow.add(i);
          zerocolumn.add(j);
        }
      }
    }
    
    for(int i:zerorow)
    {
      for(int j=0;j<columns;j++)
      {
        arr[i][j]=0;
      }
    }
    
    for(int j:zerocolumn)
    {
      for(int i=0;i<rows;i++)
      {
        arr[i][j]=0;
      }
    }
    printMatrix();
  }
  
  public static void printMatrix()
  {
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<columns;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      
      System.out.println();
    }   
  }
  
}
