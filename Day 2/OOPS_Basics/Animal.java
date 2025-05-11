package OOPS_Basics;

public class Animal {
    public void Speak()
    {

    }
    
}
class Dog
{
public void Speak()
{
    System.out.println("boow boow");
}
}
class Cat {

    public void Speak()
    {
        System.out.println("meow meow");
    }
    
}
class Sound
{
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Dog dog1=new Dog();
        cat1.Speak();
        dog1.Speak();
    }
}
