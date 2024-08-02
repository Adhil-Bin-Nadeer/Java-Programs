import java.util.Scanner;


public class Fibanocci
{
   public static void main(String[] args)
   {
        int f1= 0;
        int f2 = 1;
        int f3;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of terms you want in the Fibonacci sequence: ");
       int n = input.nextInt();
       System.out.println("");
       System.out.print("Fibanocci Series :");
       for(int i=0;i<n;i++)
       {
             
            System.out.print(f1 + "   ");
             f3 = f1 + f2;
             f1 = f2;
             f2 = f3;
        

       }

   }
}
