package in.ssn.edu.psp.workshop;

public class minesweeper {
  char[][] minefield={{'*','.'},{'*','.'}};
  
  

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    minesweeper m=new minesweeper();
    
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        System.out.print(m.minefield[i][j]+" ");
      }
      System.out.println("\n");
    }
    

  }

}
