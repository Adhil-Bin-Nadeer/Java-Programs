// Experiment : Abstract Class
// Adhil Bin Nadeer


package oops;
import java.util.Scanner;
abstract class shape
{
    abstract void numberOfSides();
    abstract int sumOfAngles();
}
class Rectangle extends shape
{
    int side;
    Rectangle(int side)
    {
        this.side = side;
    }
    void numberOfSides()
    {
        System.out.println("Sides of the Rectangle : "+side);
    }
    int sumOfAngles()
    {
        int calc =(side -2)*180;
        System.out.println("Sum of Angles : "+calc);
        return 0;
    }
}
class Triangle extends shape
{
    int side;
    Triangle(int side)
    {
        this.side = side;
    }
    void numberOfSides()
    {
        System.out.println("Sides of the Trianlgle : "+side);
    }
    int sumOfAngles()
    {
        int calc =(side -2)*180;
        System.out.println("Sum of Angles : "+calc);
        return 0;
    }
}
class Hexagon extends shape
{
    int side;
    Hexagon(int side)
    {
        this.side = side;
    }
    void numberOfSides()
    {
        System.out.println("Sides of the Hexagon : "+side);
    }
    int sumOfAngles()
    {
        int calc =(side -2)*180;
        System.out.println("Sum of Angles : "+calc);
        return 0;
    }
}
public class Abstract
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tSides of Shapes ");
        System.out.print("\nEnter the side of rectangle : ");
        int RecSide = sc.nextInt();
        Rectangle rectangle = new Rectangle(RecSide);
        System.out.print("Enter the side of triangle : ");
        int TriSide = sc.nextInt();
        Triangle triangle = new Triangle(TriSide);
        System.out.print("Enter the side of hexagon : ");
        int HexSide = sc.nextInt();
        Hexagon hexagon= new Hexagon(HexSide );
        System.out.print("==================================================");
        System.out.println("\n\t\tRectangle");
        rectangle.numberOfSides();
        rectangle.sumOfAngles();
        System.out.println("\n\t\tTriangle");
        triangle.numberOfSides();
        triangle.sumOfAngles();
        System.out.println("\n\t\tHexagon");
        hexagon.numberOfSides();
        hexagon.sumOfAngles();
        System.out.println("===============Executed Successfully================");
        sc.close();
    }
}
