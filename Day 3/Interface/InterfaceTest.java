package Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Dog();
        a1.eat();
        a1.sleep();
        a2.eat();
        a2.sleep();
        Constant cirConstant=new Circle();
        cirConstant.Area(2);

    }
    
}
