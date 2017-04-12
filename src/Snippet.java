import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Snippet {
  public static void main(String[]args){
    Date d1 = new Date();
  //  System.out.println(d1);
    ArrayList<String> allData = new ArrayList<String>();
    ArrayList<String> collectedData = new ArrayList<String>();
    ArrayList<String> unCollectedData = new ArrayList<String>();
    
    Collection firstList = new ArrayList() {{
      
  }};

  Collection secondList = new ArrayList() {{
      add("apple");
      add("orange");
      add("banana");
      add("strawberry");
  }};
    
  firstList.add("pink");
  secondList.removeAll(firstList);
  
  
  List<String> ls1 = new ArrayList<String>();
  ls1.add("a");
  ls1.add("b");
  ls1.add("c");
  ls1.add("d");


  List<String> ls2 = new ArrayList<String>();
  ls2.add("a");
  ls2.add("b");
  ls2.add("c");
  ls2.add("d");
  ls2.add("e");



  Set<String> set1 = new HashSet<String>();
  set1.addAll(ls1);

  Set<String> set2 = new HashSet<String>();
  set2.addAll(ls2);

  Set<String> set3 = new HashSet<String>();
  //set3=set2.removeAll(set1);

try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}

  //set.addAll(ls1);
  //set.addAll(ls1);


  for (String diffElement : set2) {
      System.out.println(diffElement.toString());
  }
  
  for(String a:allData)
    {     
        
      
      for(String c:collectedData)
            {

                if(!a.equals(c))
                {
                    unCollectedData.add(a);
                }
            }      
    }
    
    for(String u:unCollectedData)
    {
        
        
    }

    
    HashMap<String,String> inputMap = new HashMap<String,String>();
    inputMap.put("HumiditySensor", "ALIVE");
    inputMap.put("HumidityController", "ALIVE");
    inputMap.put("TemperatureSensor", "ALIVE");
    inputMap.put("TemperatureController", "ALIVE");
    inputMap.put("DoorBreakSensor", "ALIVE");
    inputMap.put("WindowBreakSensor", "ALIVE");
    inputMap.put("MotionSensor", "ALIVE");
    inputMap.put("IntrusionDetectionController", "ALIVE");
    inputMap.put("SecurityMonitor", "ALIVE");
    inputMap.put("ECSMonitor", "ALIVE");
    
    HashMap<String,String> inputMap2 = new HashMap<String,String>();
    inputMap2.put("HumiditySensor", "ALIVE");
    inputMap2.put("HumidityController", "ALIVE");
    inputMap2.put("TemperatureSensor", "ALIVE");
    
   
    
    for (HashMap.Entry<String, String> entry : inputMap.entrySet()) {
      if(entry.getValue().equals("DEAD"))
      {
          //mw.WriteMessage("\n"+ entry.getKey());
          //System.out.println("\n"+ inputMap2.get(entry.getKey()));
      }
  }
    
    long start = System.currentTimeMillis();
   // System.out.println(start);
    long end = start + 1*1000; // 60 seconds * 1000 ms/sec
    //System.out.println(end);
    
    while (System.currentTimeMillis() < end)
    {
     // System.out.println("true");
    }
    

    switch("Hello")
    {
      
      case "a": inputMap.put("HumiditySensor","ALIVE");
                break;
      
    }
    
    for (HashMap.Entry<String, String> entry : inputMap.entrySet()) {
      if(entry.getValue().equals("DEAD"))
      {
        entry.getKey();
      }
  }
    
    Date d2 = new Date();
   // System.out.println(d2);
    long duration = (d2.getTime()-d1.getTime());
   // System.out.println(duration);
    long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
    //System.out.println(diffInSeconds);
  }
}