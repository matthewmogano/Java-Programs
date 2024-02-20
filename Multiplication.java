import java.util.Scanner;

// 1.	Using loop, write a program that would print the multiplication table below.
public class Multiplication
{
   public static void main(String[] args)
   {
      Scanner myObj = new Scanner(System.in);
      
      System.out.println("Please enter the multiplication table you want.");
      int table = myObj.nextInt();
      int i = 1; 
      
      do
      {
         for(int j = 1; j <=table; j++)
         {
            System.out.print(i*j +""+'\t');
         }
         i++;
         System.out.println("");
      }
      while(i<(table+1));
   }
}