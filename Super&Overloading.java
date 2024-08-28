// Experiment : Super and Overloading
// Adhil Bin Nadeer

package oops;
import java.util.Scanner;
class Employee1
{
    float HRA, DA,Salary,GrossSalary;
    void display()
    {
        System.out.println("\nEmployee");
    }
    void calcSalary()
    {
        GrossSalary = Salary + (DA/100)*Salary +(HRA/100)*Salary;
        System.out.println("Salary of the employee : "+GrossSalary);
    }
}

class Engineer extends Employee1
{
//3float GrossSalary;
    Engineer(float HRA,float Salary,float DA)
    {
        super.HRA = HRA;
        super.Salary =Salary;
        super.DA= DA;
    }
    void display()
    {
        super.display();
        System.out.println("Engineer");
    }
    void calcSalary()
    {
        super.calcSalary();
        System.out.println("Salary of the engineer : "+GrossSalary*2);
        System.out.println("===============Executed Successfully================");
    }
}
public class eEmployee
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tEnter the details ");
        System.out.print("Enter the Salary : ");
        float Salary = scanner.nextInt();
        System.out.print("Enter the House Rent Allowance (HRA) : ");
        float HRA = scanner.nextInt();
        System.out.print("Enter the Dearence Allowance (DA) : ");
        float DA = scanner.nextInt();
        Engineer Engg = new Engineer(HRA,Salary,DA);
        System.out.print("===================================================");
        Engg.display();
        Engg.calcSalary();
    }
}
