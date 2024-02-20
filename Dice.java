public class Dice
{
   public static void main(String[] args)
   {
      int N = Integer.parseInt(args[0]);
      int T = Integer.parseInt(args[1]);
      double r = Math.random();
      int n = (int)(r*N);
      int t = (int)(r*T);
      int sum;
      
      sum = n + t;
      
      System.out.println(n);
      System.out.println(t);
      System.out.println("The Sum is: " +sum);
   }
}