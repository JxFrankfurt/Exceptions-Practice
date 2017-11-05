//Jackson Frankfurt
//10/30/2017
//OS: Windows 10; 64 bit
//Assignment 5
//Time: 3 + 5.5 = 8.5 hours. It was a learning experience.

//this is the driver file

/*
This program prompts the user to choose which error or exception they want to trigger and tells them how to do it.
It's pretty much an exception-practice program.
*/

import java.util.*;


public class ExceptionsTest{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int choice;
      Exceptions assign5 = new Exceptions();
      System.out.println("What would you like to test? Enter 1, 2, 3, 4, 5, or 6.");
      System.out.println("1) ArrayIndexOutOfBoundsException");
      System.out.println("2) StringIndexOutOfBoundsException");
      System.out.println("3) InputMismatchException");
      System.out.println("4) ClassNotFoundException");
      System.out.println("5) OutOfMemoryError");
      System.out.println("6) NoSuchMethodExceptoin");
      choice = input.nextInt();
      try{
         switch(choice){
         case(1): //method call for a method that tests ArrayIndexOutOfBoundsException
            assign5.ArrayIOB();
            break;
         case(2):
            assign5.StringIOB();
            break;
         case(3):
            assign5.InputMm();
            break;
         case(4):
            assign5.NoClass();
            break;
         case(5):
            assign5.NoMemory();
            break;
         case(6):
            assign5.NoMethod();
            break;
         default: System.out.println("Error: Number must be 1 through 6.");
            break;
         }
      }
      catch(ArrayIndexOutOfBoundsException ex){
         System.out.println("Error: You accessed an array index out of bounds.");
      }
      catch(StringIndexOutOfBoundsException ex){
         System.out.println("Error: You accessed a string index out of bounds.");
      }
      catch(InputMismatchException ex){
         System.out.println("Error: You input the wrong datatype.");
      }
      catch(ClassNotFoundException ex){
         System.out.println("Error: You tried to access an unavailable or nonexistant class.");
      }
      catch(OutOfMemoryError ex){
         System.out.println("Error: You tried to allocate too much memory.");
      }
      catch(NoSuchMethodException ex){
         System.out.println("Error: You tried to call a method that doesn't exist.");
      }
   }
}