//Jackson Frankfurt
//10/30/2017
//OS: Windows 10; 64 bit
//Assignment 5
//Time: written in the driver
//descrption on driver.
//this is not the driver file
   
import java.util.*;
import java.lang.reflect.*;
import java.lang.*;

public class Exceptions{
   public static void ArrayIOB(){
      Scanner input = new Scanner(System.in);
      int[] myInt = new int[13];
      System.out.println("There is an integer array with 13 indexes. Which index would you like to check?");
      myInt[0] = input.nextInt();
      System.out.printf("There is a %d in index %d.\n", myInt[myInt[0]], myInt[0]);     
   }
   public static void StringIOB(){
      Scanner input = new Scanner(System.in);
      String myString = "012345678";
      System.out.println("There is a string containing only \"012345678\". Which index in this string would you like to check?");
      int index = input.nextInt();
      System.out.println(myString.charAt(index));          
   }
   public static void InputMm(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an int(or enter something else for an exception).");
      int myInt = 9;
      myInt = input.nextInt();
   }
   public static void NoClass() throws ClassNotFoundException{
      Scanner input = new Scanner(System.in);
      System.out.println("What class do you want to check? For an error, type a nonsense class that's not \"Exceptions\"");
      String potentialClassName = input.next();
         //java.lang.ClassLoader.findSystemClass(potentialClassName);//protected and therefore won't work
      //reference: https://docs.oracle.com/javase/7/docs/api/java/lang/ClassNotFoundException.html 
      Class.forName(potentialClassName);
      System.out.println("Wow, we sure checked that class.");
      }
   public static void NoMemory(){
      Scanner input = new Scanner(System.in);
      Long thisDude = Runtime.getRuntime().maxMemory();
      System.out.printf("There are %d memory slots total. How many would you like to allocate?\n", thisDude);
      System.out.println("A small number like 1 will work, but a large number(closer to the number of memory slots) will be too much.\n");
      Long userDude = input.nextLong();
      int[] array = new int[(int) (userDude+0)];//haxors
      for(int i = 0; i < array.length; ++i) array[i] = i+1;
      System.out.println("Done!");
   }
   public static void NoMethod() throws NoSuchMethodException{               
      try{
         Scanner input = new Scanner(System.in);
         System.out.println("Type \"true\" to throw an error or anything else to not throw an error.");
         String userMethod = input.nextLine();
         Class c;
         c = Class.forName("Exceptions"); //the name of this class, it can be any real class, i think.
         Class[] classArray = new Class[5];
         System.out.printf("userMethod = %s\n", userMethod);
         if(userMethod.equals("true")){
            Method m = c.getDeclaredMethod(userMethod, classArray);
         }
         System.out.println("Finally done.");
      }
      catch (ClassNotFoundException ex){
         ex.printStackTrace();
      }
   }
   public static void myMethod(){
         System.out.println("myMethod was chosen.");
   }
}