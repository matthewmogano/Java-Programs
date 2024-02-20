public class Remainder
{
   public static void main(String[] args)
   {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int rem;
      
      //First checks if 1st number is bigger than 2nd number. If it returns TRUE then the program will perfom the statements at the bottom.
      if (num1 > num2)
      {
         rem = num1 % num2;
         if (rem == 0)
         {
            System.out.println("TRUE");
         }
         else
         {
            System.out.println("FALSE");
         }
      }
      else //If 2nd Number is bigger than 1st Number than the program with do the operations at the bottom.
      {
         rem = num2 % num1;
         if (rem == 0)
         {
            System.out.println("TRUE");
         }
         else
         {
            System.out.println("FALSE");
         }
         
      }
      
   }
}