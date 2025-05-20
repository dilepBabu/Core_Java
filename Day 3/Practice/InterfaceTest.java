package Practice;

public class InterfaceTest {
    public static void main(String[] args) {
        Interfacetopic testone=new Cat();
        Interfacetopic testone1=new Dog();
        Interfacetopictwo two=(Dog)testone1;
        System.out.println(two.getname());
        Interfacetopictwo one=(Cat)testone;
        System.out.println(one.getname());

        

    }
    
}
