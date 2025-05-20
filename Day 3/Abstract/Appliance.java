package Abstract;

public abstract class Appliance {
    public abstract void turnOn();
    public void turnOff()
    {   
        System.out.println("Appliance is off");
    }
    
}
class Fan extends Appliance
{
    public void turnOn()
    {
        System.out.println("Fan is turnOn");
    }

}
class run
{
    public static void main(String[] args) {
       
       Fan fan=new Fan();
       fan.turnOff();
       fan.turnOn();
    }
}