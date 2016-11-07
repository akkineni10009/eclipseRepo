import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinearRegression {
  
  static LinkedList<Double> estimatedProxtSize;
  static LinkedList<Double> planAddedModifiedSize;
  static LinkedList<Double> actualAddedModifiedSize;
  static LinkedList<Double> actualDevelopmentHours;
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args)
  {
    estimatedProxtSize = new LinkedList<Double>(Arrays.asList(130.0,650.0,99.0,150.0,128.0,302.0,95.0,95.0,368.0,961.0));
    planAddedModifiedSize = new LinkedList<Double>(Arrays.asList(163.0,765.0,141.0,166.0,137.0,355.0,136.0,1206.0,433.0,1130.0));
    actualAddedModifiedSize = new LinkedList<Double>(Arrays.asList(186.0,699.0,132.0,272.0,291.0,331.0,199.0,1890.0,788.0,1601.0));
    actualDevelopmentHours = new LinkedList<Double>(Arrays.asList(15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2));
  
    System.out.println("Enter the 'x' and 'y' parameter of the regression:\nestimatedProxtSize planAddedModifiedSize actualAddedModifiedSize actualDevelopmentHours \n");
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    LinkedList<Double> x_parameter=null;
    LinkedList<Double> y_parameter = null;
    
    if(x==1) x_parameter =estimatedProxtSize;
    if(x==2) x_parameter =planAddedModifiedSize;
    if(x==3) x_parameter =actualAddedModifiedSize;
    if(x==4) x_parameter =actualDevelopmentHours;
    
    if(y==1) y_parameter =estimatedProxtSize;
    if(y==2) y_parameter =planAddedModifiedSize;
    if(y==3) y_parameter =actualAddedModifiedSize;
    if(y==4) y_parameter =actualDevelopmentHours;
      
    
    double beta1_numerator = (sumOfProductOfCoordinates(x_parameter,y_parameter)) - ((x_parameter.size()) * (findMeanOfLinkedList(x_parameter)) * (findMeanOfLinkedList(y_parameter)));
    double beta1_denomirator = (sumOfSquaresOfArray(x_parameter)) - ((x_parameter.size()) * (findMeanOfLinkedList(x_parameter)) * (findMeanOfLinkedList(x_parameter))) ; 
    double beta1= (beta1_numerator) / (beta1_denomirator);
    double beta0= (findMeanOfLinkedList(y_parameter)) - (beta1 * ((findMeanOfLinkedList(x_parameter))));
    
    System.out.println("beta1 is "+beta1);
    System.out.println("beta0 is "+beta0);
    }
    
  //Finds mean of all elements in the array 
  public static double findMeanOfLinkedList(LinkedList<Double> currentList)
    {
      double sum=0;
      for(Double in : currentList)
      {
        sum+=in; 
      }
      
      return (sum) / currentList.size();
    }
  
  public static double findSumOfLinkedList(LinkedList<Double> currentList)
  {
    double sum=0;
    for(Double in : currentList)
    {
      sum+=in; 
    }
    
    return sum;
  }
    
    //Finds the sum of squares of all the elements of the array
    public static double sumOfSquaresOfArray(LinkedList<Double> currentList)
    {
      double sum=0;
      for(Double in : currentList)
      {
        sum+= (in*in); 
      }
      return sum;
    }
    
    //Finds the sum of product of elements of the arrays
    public static double sumOfProductOfCoordinates(LinkedList<Double> x,LinkedList<Double> y)
    {
      double sum_of_products=0;
      for(int i=0;i<x.size();i++)
      {
        sum_of_products+=x.get(i) * y.get(i);
      }
      return sum_of_products;
    }
    
}