import java.util.Scanner;

public class Trigonometry
{
   public static void main(String[] args)
   {
      Scanner myObj = new Scanner(System.in);
      double sum;
      
      System.out.println("Please enter value for t.");
      double t = myObj.nextDouble();
      
      //Use Java API's for Trigonometric funtions.
      
      sum = Math.sin(2*t) + Math.sin(3*t);
      
      System.out.println("The Sum of t, using the formula Sin(2t) + Sin(3t) is " +sum);
      
   }
}