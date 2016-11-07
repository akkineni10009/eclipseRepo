import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;

public class NumberOfLinesInFile {

  /*
   * Takes a java file as input and counts the number of methods
   * and number of lines in that java file.
   */
  public static void main(String[] args) throws FileNotFoundException {
    try {

      Class cls = Class.forName("FindMeanMedianMode");  
      Method[] methods = cls.getDeclaredMethods();
      System.out.println("Total methods in the class are " + methods.length);


      String line;
      int count = 0;
      BufferedReader br = new BufferedReader(
          new FileReader("C:/Users/ASUS-A555L/workspace/Practise/src/FindMeanMedianMode.java"));
      while ((line = br.readLine()) != null) {
        count++;
      }

      System.out.println("Total number of lines in the class are " + count);

    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}