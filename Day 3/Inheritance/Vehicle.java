package Inheritance;

public class Vehicle {

    public void start()
    {
        System.out.println("Super class start method");
    }
}
class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Sub class start method or override start method ");
    }
    public static void main(String[] args) {
        Car car1=new Car();
        car1.start();
    }
}