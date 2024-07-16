/*
Name: Maroof Sulaiman
Date: July 9th, 2024
Purpose of Program: To create a program that can square a number, cube a number, or evaluate a power with any base and any exponent. 
*/

import java.util.Scanner;      //Import scanner object

public class Main {
  public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);     //Instantiate scanner object

  String welcome = "Welcome to the Cubes, Squares and Powers program!";   //Welcome message to be displayed once
  
  //Declaring and initializing variables
  int base = 0;
  int power = 0;
  int result = 1;
  int choice = 0;

    System.out.println(welcome);

    //While loop that will always be satisfied (Break happens if none of the conditions are met)
    while (choice != 4)
      { 
        System.out.println("");
        System.out.println("1... Find the value of a number squared (NOTE: 2² = 2 x 2)");
        System.out.println("2... Find the value of a number cubed (NOTE: 2³ = 2 x 2 x 2)");
        System.out.println("3... Find the value of a number, to any power");
        System.out.println("4... Exit");
        System.out.println("");
        System.out.print("Enter a choice: ");
        choice = keyedInput.nextInt();

        //User input = 1
        if (choice == 1)
          {
            System.out.print("Enter a number to be squared: ");     //Gets the number to be squared
            base = keyedInput.nextInt();
            for (int i = 0; i < 2; i++)       //Loops twice, squaring the number as result starts equal to 1
              result = result * base;
            System.out.println("The number " + base + " squared is " + result);
            result = 1;                       //Resets result to 1
          }
          //User input = 2
          else if (choice == 2)
          {
            System.out.print("Enter a number to be cubed: ");
            base = keyedInput.nextInt();
            for (int i = 0; i < 3; i++)      //Loops three times, cubing the number
            result = result * base;
            System.out.println("The number " + base + " cubed is " + result);
            result = 1;                      //Resets result to 1
          }
          //User input = 3
          else if (choice == 3)
          {
            System.out.print("Enter a base: ");
            base = keyedInput.nextInt();
            System.out.print("Enter a power: ");
            power = keyedInput.nextInt();

              if (base == 0)
              {
                if (power == 0)      //Checks of both base and power are 0, this is a special math conditon
                {
                  result = 1;             //Resets result to 1
                  System.out.println("The result of " + base + " to the power of " + power + " is " + result);
                }
                else                 //Carries out regular math if base is 0 but power is not 0 as well
                {
                  result = 0;
                  System.out.println("The result of " + base + " to the power of " + power + " is " + result);
                  result = 1;             //Resets result to 1
                }
              }
              //Checks if a negative power is involved  
              else if (power < 0)           
              {
                power = power * -1;          //Takes absolute value of power to perform calculations
                for (int i = 0; i < power; i++)   //Loops one less time than the value of power (0 is counted)
                result = result * base;
                power = power * (-1);       //Converts power back to a negative for output 
                System.out.println("The result of " + base + " to the power of " + power + " is 1/" + result);
                result = 1;             //Resets result to 1
              }
              else
              {
                for (int i = 0; i < power; i++)   //Loops one less time than the value of power (0 is counted)
                result = result * base;
                System.out.println("The result of " + base + " to the power of " + power + " is " + result);
                result = 1;     //Resets result to 1
              }
          }
      }
    
    System.out.println("Exiting program"); 
    keyedInput.close();
    
  }
}