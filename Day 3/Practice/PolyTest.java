package Practice;

class Car{

    
    
    
    public void brake()
    {
        System.out.println("super class brake");
    }
}
class Taxi extends Car
{
    int j=10;
    public void brake()
    {
        System.out.println("taxi class brake");
    }
}
class Police extends Car
{
    public void brake()
    {
        System.out.println("police class brake");
    }
}
class Race extends Car{
    public void brake()
    {
        System.out.println("race class brake");
    }

    
}


/*
 * FINAL
 * 1)varaible -once we can decleare the value we cant change the value 
 * 2)method -once we decleare the method we cant override the method
 * 3)class -once we decleare the class the object reference cant refer anymore 
 *  but we can refer the method of that class  and we cant create subclass also
 * "in short the object cant reassign to another object reference"
 */


public class PolyTest {
    public void brake(Car car)
    {
        car.brake();
    }
    public static void main(String[] args) {
       final PolyTest pt=new PolyTest();
        Police pc=new Police();
        Race rc =new Race();
        Taxi taxi=new Taxi();
        pt.brake(pc);
        pt.brake(rc);
        pt.brake(taxi);
        /*Polymorpic Collection */
        Car car[]={new Police(),new Race(),new Taxi()};
        for (int i = 0; i < car.length; i++) {
            car[i].brake();
        }
       taxi.j =10;
       /*  it shows error because of final decleration of the class pt =new PolyTest();*/

    }
    
}
