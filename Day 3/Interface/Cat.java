package Interface;

public class Cat implements Animal{
    public void sleep()
    {
        System.out.println("Cat sleep");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
        
    }
    
}
