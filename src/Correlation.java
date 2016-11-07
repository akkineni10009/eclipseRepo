import java.util.Arrays;
import java.util.LinkedList;

/*
 * This program calculates the correlation between 2 sets of numbers
 * @author: Akkineni Ajay Krishna
 * @Date: 02-08-2016
 */
public class Correlation {

  public static LinkedList<Double> actualAddedModified = new LinkedList<Double>(
      Arrays.asList(186.0, 699.0, 132.0, 272.0, 291.0, 331.0, 199.0, 1890.0, 788.0, 1601.0));
  public static LinkedList<Double> developmentHours = new LinkedList<Double>(
      Arrays.asList(15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2));

  public static void main(String[] args) {
    // Call the function which computes the correlation
    findCorrelationBetweenTwoSets(actualAddedModified, developmentHours);
  }


  /*
   * Calculates the correlation between two sets and returns the correlation value
   * @author:Akkineni Ajay Krishna
   * @Date:02-08-2016
   */
  public static void findCorrelationBetweenTwoSets(LinkedList<Double> actualAddedModified,
      LinkedList<Double> developmentHours) {
    try {
      double correlationValue = 0.0, correlationNumerator = 0.0, correlationDenomirator = 0.0;
      /*
       * correlationNumerator calculates the numerator of the correlation value
       * correlationDenomirator calculates the denominator of the correlation value dividing the
       * correlationNumerator with correlationDenomirator gives correlationValue LinearRegression
       * class already has functions which can be re-used in this program The methods in
       * LinearRegression class are static so they can be directly accesses without creating object
       */
      correlationNumerator = (actualAddedModified.size()
          * LinearRegression.sumOfProductOfCoordinates(actualAddedModified, developmentHours))
          - ((findSumOfLinkedList(actualAddedModified)) * (findSumOfLinkedList(developmentHours)));

      correlationDenomirator = ((actualAddedModified.size()
          * LinearRegression.sumOfSquaresOfArray(actualAddedModified))
          - (findSumOfLinkedList(actualAddedModified) * findSumOfLinkedList(actualAddedModified)))
          * ((actualAddedModified.size() * LinearRegression.sumOfSquaresOfArray(developmentHours))
              - (findSumOfLinkedList(developmentHours) * findSumOfLinkedList(developmentHours)));

      correlationValue = (correlationNumerator) / (correlationDenomirator);
      System.out.println(correlationValue);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /*
   * This function finds the sum of all the elements in the LinkedList and returns the sum
   */
  public static double findSumOfLinkedList(LinkedList<Double> currentList) {
    double sumOfElements = 0;
    for (Double element : currentList) {
      sumOfElements += element;
    }

    return sumOfElements;
  }
}
