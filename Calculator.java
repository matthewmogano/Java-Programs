import java.util.Scanner;

public class Calculator
{
   public static void main(String[] args)
   {
      Scanner myObj = new Scanner(System.in);
      
      System.out.println("Please enter the operation you want to do: + - / *");
      char operator = myObj.next().charAt(0);
      int sum;
      
      switch(operator)
      {
         case '+':
         System.out.println("Enter the numbers you want to add.");
         int num1 = myObj.nextInt();
         int num2 = myObj.nextInt();
         sum = num1 + num2;
         
         System.out.println("The value is " +sum);
         break;
         
         case '-':
         System.out.println("Enter the numbers you want to subtract.");
         num1 = myObj.nextInt();
         num2 = myObj.nextInt();
         sum = num1 - num2;
         
         System.out.println("The value is " +sum);
         break;
         
         case '/':
         System.out.println("Enter the numbers you want to divide.");
         num1 = myObj.nextInt();
         num2 = myObj.nextInt();
         sum = num1 / num2;
         
         System.out.println("The value is " +sum);
         break;

         case '*':
         System.out.println("Enter the numbers you want to multiply.");
         num1 = myObj.nextInt();
         num2 = myObj.nextInt();
         sum = num1 * num2;
         
         System.out.println("The value is " +sum);
         break;
         
         default:
            System.out.println("INVALID INPUT");

      }
   }
   
}
