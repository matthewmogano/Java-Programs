//2.	Write a program that takes three positive integers as command-line arguments and prints true if any one of them is greater than or equal to the sum of the other two and false otherwise. 

public class Greatest
{
   public static void main(String[] args)
   {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int num3 = Integer.parseInt(args[2]);
      boolean greater;
      
      //Now that were using a Boolean variable, we have to use Boolean operators to compare the 3 numbers.
      greater = (num3 >= num1 + num2) || (num1 >= num2 + num3) || (num2 >= num1 + num3);
      System.out.println(greater);
      
   }
}