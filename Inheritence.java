//Experiment : Inheritence
// Adhil Bin Nadeer


package oops;
import java.util.Scanner;
class Employee
{
    String Name,Address;
    int Age;
    long phoneNumber,Salary;
    void printSalary() 
    {
    System.out.println("Salary : "+Salary);
    }
}
class Officer extends Employee
{
    String Specialization;
    Officer(String Name,String Address,int Age,long phoneNumber,long Salary,String
    Specialization)
    {
        this.Name=Name;
        this.Address=Address;
        this.Age=Age;
        this.phoneNumber=phoneNumber;
        this.Salary=Salary;
        this.Specialization=Specialization;
     }
}
class Manager extends Employee
{
    String department;
    Manager(String Name,String Address,int Age,long phoneNumber,long Salary,String department)
    {
        this.Name=Name;
        this.Address=Address;
        this.Age=Age;
        this.phoneNumber=phoneNumber;
        this.Salary=Salary;
        this.department=department;
    }
}
public class Inheritence
{
    public static void main(String []args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tDETAILS OF OFFICER");
        System.out.print("Enter the name of officer : ");
        String Name=sc.nextLine();
        System.out.print("Enter the address of officer : ");
        String Address=sc.nextLine();
        System.out.print("Enter the age of officer:");
        int Age=sc.nextInt();
        System.out.print("Enter the phone number of officer:");
        long phoneNumber=sc.nextLong();
        System.out.print("Enter the salary of officer:");
        long Salary=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the specialization of officer : ");
        String Specialization=sc.nextLine();
        Officer of=new
        
        Officer(Name,Address,Age,phoneNumber,Salary,Specialization);//constructor of officer

        System.out.println("\n\n\tDETAILS OF MANAGER");
        System.out.print("Enter the name of Manager : ");
        Name=sc.nextLine();
        System.out.print("Enter the address of Manager : ");
        Address=sc.nextLine();
        System.out.print("Enter the age of Manager : ");
        
        Age=sc.nextInt();
        System.out.print("Enter the phone number of Manager : ");
        phoneNumber=sc.nextLong();
        System.out.print("Enter the salary of Manager : ");
        Salary=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the department of Manager : ");
        String department=sc.nextLine();
        Manager man=new
        
        Manager(Name,Address,Age,phoneNumber,Salary,department);//constructor of manager
        System.out.print("====================================================================");
        System.out.println("\n\tOfficer");
        System.out.println("Name : "+of.Name+"\nAdress :  "+of.Address+"\nAge : "+of.Age+"\nPhone Number : "+of.phoneNumber+"\nSpecialization : "+of.Specialization);
        of.printSalary();
        System.out.println("\n\tMANAGER");
        System.out.println("Name : "+man.Name+"\nAdress : "+man.Address+"\nAge : "+man.Age+"\nPhone Number :"+man.phoneNumber+"\nDepartment : "+man.department);
        man.printSalary();
        System.out.println("==============Executed Successfully=========================");
     }
}
