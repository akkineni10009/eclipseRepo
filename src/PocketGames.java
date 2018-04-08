import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PocketGames {

  public static void main(String[] args){
    int n=5;
    String[] queryTypes= new String[]{"F","F","F","F","F","T"};
    int[] s1={1,3,5,2,4,1};
    int[] s2={2,4,1,3,5,3};
    
    HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
    ArrayList<Integer> result=new ArrayList<Integer>();
    
    for(int i=1;i<=n;i++){
      HashSet<Integer> temp = new HashSet<Integer>();
      temp.add(i);
      map.put(i,temp);
    }
    for(int i=0;i<queryTypes.length;i++){
      HashSet<Integer> set1,set2;
      if(queryTypes[i].equals("F")){
        set1= map.get(s1[i]);
        set1.add(s2[i]);
        map.put(s1[i], set1);
        
        set2= map.get(s2[i]);
        set2.add(s1[i]);
        map.put(s2[i], set2);
      }
      else{
        set1=map.get(s1[i]);
        set2=map.get(s2[i]);
        set1.addAll(set2);                         
        result.add(set1.size());
        set1.removeAll(set2);
      }
    }
    for(int i=0;i<result.size();i++){
      System.out.println(result.get(i));  
    }
    
  }
}
