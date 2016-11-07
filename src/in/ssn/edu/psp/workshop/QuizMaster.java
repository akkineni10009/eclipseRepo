package in.ssn.edu.psp.workshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * This class randomly takes questions from a file It lets users to answer the questions Displays
 * the users whether their choice is correct/wrong Calculates the number of correct answers
 */

public class QuizMaster {

  static Scanner scanner = new Scanner(System.in);
  static int score = 0;

  public static void main(String[] args) throws IOException {
    Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    try {

      BufferedReader bufferedreader = new BufferedReader(
          new FileReader("C:/Users/ASUS-A555L/Desktop/SEM-1/PSP/Workshop/Input.txt"));

      for (int i = 0; i < arr.length - 1; i++) {
        String line = bufferedreader.readLine();
        String input = "";
        String[] input_line = line.split(",");
        System.out.println(input_line[0]);
        System.out.println("a. " + input_line[1]);
        System.out.println("b. " + input_line[2]);
        System.out.println("c. " + input_line[3]);
        System.out.println("d. " + input_line[4]);

        input = scanner.nextLine();

        HashMap<String, String> lookUpMap = new HashMap<String, String>();
        lookUpMap.put("a", input_line[1]);
        lookUpMap.put("b", input_line[2]);
        lookUpMap.put("c", input_line[3]);
        lookUpMap.put("d", input_line[4]);

        if (input.equals(input_line[5])) {
          System.out.println(lookUpMap.get(input_line[5]) + " is the right answer");
          score++;
        } else {
          System.out
              .println("Wrong Answer:" + lookUpMap.get(input_line[5]) + " is the right answer");
        }
      }
      System.out.println(score);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.getMessage();
    }
  }
}
