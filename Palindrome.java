//Experiment : Palindrome
//Adhil Bin Nadeer

package oops;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner obj1 = new Scanner(System.in);
        int flag=0;
        String str1,str;
        System.out.println("Enter the String");
        str1 = obj1.nextLine();
        str = str1.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("The given string "+str1+" is not palindrome");
        }
        else
        {
            System.out.println("The given string "+str1+" is palindrome");
        }
    }
}
