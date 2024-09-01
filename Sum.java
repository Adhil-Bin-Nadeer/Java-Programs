//Sum of Numbers
//Adhil Bin Nadeer

package oops;
import java.util.Scanner;

public class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers to be added : ");
        int limit = sc.nextInt();
        System.out.println("Enter the Numbers : ");
        int[] a = new int[limit];
        for(int i=0;i<limit;i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<limit;i++)
        {
            sum = sum + a[i];
        }
        System.out.print("Result : "+sum);
        sc.close();
    }
}
