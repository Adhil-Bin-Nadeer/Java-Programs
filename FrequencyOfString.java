/*Java program to find the frequency of the repeating letters in a string
* Name = Adhil-Bin-Nadeer
*
**/

package oops;
import java.util.Scanner;
public class String_Frequency
{
    public static void main(String args[])
    {
        Scanner obj1 = new Scanner(System.in);
        int flag=0;
        int count=0;
        String str1,str2;
        System.out.println("Enter the String");
        str1 = obj1.nextLine();
        str2 = str1.toLowerCase();
        System.out.println("Which alphabet frequency is needed ?");
        char str = obj1.next().charAt(0);
        for(int i=0;i<str2.length()-1;i++)
        {
            if(str2.charAt(i)==str)
            {
                count++;
            }
        }
        System.out.println("The frequency of alphabet "+str+" is : "+count);
    }
}
