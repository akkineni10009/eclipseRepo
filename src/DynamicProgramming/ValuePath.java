package DynamicProgramming;

import java.util.ArrayList;

public class ValuePath {
  
  private int value;
  private ArrayList<Integer> path= new ArrayList<Integer>();
  
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public ArrayList<Integer> getPath() {
    return path;
  }
  public void setPath(int index) {
    path.add(index);
  }
  
  
}
