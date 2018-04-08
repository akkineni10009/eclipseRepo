import java.util.ArrayList;
import java.util.List;

public class SolutionT {

  public static void main(String[] args){
    int array[] ={2,2,2,2,1,2,-1,2,1,3};
    List<Integer> solution = new ArrayList<>();
    solution=solution(array);
    System.out.println(solution);                                                                                                              
  }
  
  static List solution(int[] array) {
    List<Integer> longest = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    int previous = Integer.MAX_VALUE;
    for (int value : array) {
        if (value <= previous) {
            if (longest.size() < current.size()) {
                longest = current;
            }
            current = new ArrayList<>();
        }
        current.add(value);
        previous = value;
    }

    return longest.size() < current.size() ? current : longest;
  }

  
}
