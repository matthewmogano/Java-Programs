import java.util.Scanner;

//6.	Write a program that takes three double values x0, v0, and t from the command line and prints the value of (v0*t) + ((g*(t*t))/2 , where g is the constant 9.78033.
public class Formula
{
   public static void main(String[] args)
   {
   Scanner myObj = new Scanner(System.in);
   final double g = 9.78033;
   double sum;
   
   System.out.println("Please enter value x0.");
   double x0 = myObj.nextDouble();
   
   System.out.println("Please enter value v0.");
   double v0 = myObj.nextDouble();
   
   System.out.println("Please enter value for time.");
   double t = myObj.nextDouble();
   
   sum = x0 + (v0*t) + ((g*(t*t))/2);
   
   System.out.println("The value, using the formula x0 + (v0*t) + ((g*t^2)/2) is: " +sum);
   
   }
}