package Architecture;
/* This document is created by Akkineni Ajay Krishna_LabWk2_Akkineni
*Created date- 06/02/2017
*Last modified date- 06/02/2017
*Descripton of the program- This program takes input from the user number 1 or 2
*Based on the number given by the user, the program would print welcome messages on to the screen
*The program then prints the message "I love programming" message 10 times in the console
*The program then prompts the user to enter his three test scores. Once the program gets the input from the user it computes
*the average and rints the output to "output.txt" file
*/

import java.io.PrintWriter;
import java.lang.System;
import java.util.Scanner;

public class Krishna_LabWk2_Akkineni
{
  public static Scanner sc=new Scanner(System.in);
  public static void main(String[] args)
  {
  do
     {
       userWelcome(); // This method welcome the user to the program
       printLoveMessages(); // This method prints love messages
       printAverageOfTestScores();  // This method prints average of test scores
     } while(true);
  }
  
/*Once the user input's his option, the program would print a welcome message. 
  The program doesn't take anything as input and doesn't return anything.
*/
  public static void userWelcome()
  {
     System.out.println("Enter either 1 or 2");
     int temp=0;
     temp=sc.nextInt();
     
     if(temp==1)
     {
       System.out.println("Good Morning !");
     }
     
     else if(temp==2)
     {
       System.out.println("Good Evening !");
     }
     
     else
     {
       System.exit(0); // If any other option is entered, then the program will terminate
     }
     
  }
  
/*After user input is done in the previous step, the program prints love messages for 10 times 
  The program doesn't take anything as input and doesn't return anything.
*/

  public static void printLoveMessages()
  {
   int messageCounter=0;  // Temperary counter variable to make sure the system prints the messages only 10 times
   while(messageCounter<10) // While loop will run for 10 times
   {
     System.out.println("I love programming!");
     messageCounter++;
   }
  }
  
/*The user would input his test scores, the function calls another function which would compute the average 
* of the three test scores 
*/
  public static void printAverageOfTestScores()
  {
    double[] userScore=new double[3];  // An array to store the test scores
    int tempCounterForScore=0;
  
    while(tempCounterForScore<3)
    {
      System.out.println(" Enter your" + tempCounterForScore + "Test Score"); // Prompt for the three test scores
      userScore[tempCounterForScore]=sc.nextDouble(); //Store the entered values
      tempCounterForScore++;
    }
    
    computeAverageOfTestScores(userScore); // Pass the array to the function which would compute the average
  }
  
  /*
  *This method would compute the average of the test scores from the array that is passed as input
  *Once the average is calculated, it would call a function which would print the average value into a file
  */
  public static void computeAverageOfTestScores(double[] userScore)
  {
    double userScoreAverage=0; // A double variable to store the test score average
    double userScoreSum=0;  // A double Variable to store the test scores sum
    double length=userScore.length;
    int tempScoreCounter=0;
    
    while(tempScoreCounter<length)
    {
      userScoreSum+=userScore[tempScoreCounter];
      tempScoreCounter++;
    }
    
    userScoreAverage=(userScoreSum/userScore.length); //Computing the average of the test scores
    writeOutputOfAverageScoreToFile(userScoreAverage);
  }
  /*
  * This method writes the computed average of the testscores of the user to a file "output.txt"
  * This file would be created if it doesn't exist
  */
  public static void writeOutputOfAverageScoreToFile(double testScoreAverage)
  {
    
    try
    {
      PrintWriter fileWriter=new PrintWriter("output.txt"); // Creating PrintWriter object
      fileWriter.println(testScoreAverage); // Writing the data to the file
      fileWriter.flush(); 
      fileWriter.close(); //Closing the PrintWriter object
    }
    
    catch(Exception e)
    {
      System.out.println("There seems to be an issue in writing the average score result to the file");
    }
  } 
}