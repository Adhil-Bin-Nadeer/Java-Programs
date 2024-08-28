//Experiment : Method Overloading
//Name = Adhil-Bin-Nadeer


package oops;
import java.util.*;
class Area
{
    final float pi = (float)3.14;
    float CalcArea(float rad)
    {
        return pi*rad*rad;
    }
    float CalcArea(float length, float width)
    {
        return length* width;
    }
    double CalcArea(double base, double height)
    {
        return 0.5 * base * height;
    }
}
public class OverLoading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        System.out.println("Area of a Circle");
        System.out.print("Enter the radius : ");
        float radius = sc.nextInt();
        System.out.println("Result : " + obj.CalcArea(radius));
        System.out.println();
        System.out.println("Area of Rectangle");
        System.out.print("Enter the length : ");
        float length = sc.nextInt();
        System.out.print("\nEnter the width : ");
        float width = sc.nextInt();
        System.out.println("Result : " + obj.CalcArea(length,width));
        System.out.println();
        System.out.println("Area of Triangle");
        System.out.print("Enter the base : ");
        double base = sc.nextInt();
        System.out.print("\nEnter the height : ");
        double height = sc.nextInt();
        System.out.println("Result : " + obj.CalcArea(base,height));
    }
}
