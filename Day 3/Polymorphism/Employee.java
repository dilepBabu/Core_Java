package Polymorphism;

public class Employee {
    public void calculateSalary()
    {
        System.out.println("Super class salary");
    }
    
}
class Manager extends Employee
{
    public void calculateSalary()
    {
        System.out.println("Manager salary");
    }
}
class Developer extends Employee
{
    public void calculateSalary()
    {
        System.out.println("Developer salary");
    }
}
class Ceo
{
    public static void main(String[] args) {
        Employee em1=new Manager();
        em1.calculateSalary();
        Employee em2= new Developer();
        em2.calculateSalary();

    }
}