package Goldman;

public class LadderReachNStep {
  
  public static void main(String[] args){
    
    int noOfWays=ladderReachNStep(5);
    System.out.println(noOfWays);
  }
  
  public static int ladderReachNStep(int step){
    int[] output= new int[step];
    
    if(step>=1){
      output[0]=1;
    }
    
    if(step>=2){
      output[1]=2;
    }
    
    if(step>=3){
      output[2]=4;
    }
    
    if(step>3){
      for(int i=3;i<step;i++){
        output[i]=output[i-1]+output[i-2]+output[i-3];
     }
    }
    
    return output[step-1];
  }
  
}