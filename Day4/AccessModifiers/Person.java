package AccessModifiers;

public class Person {

    public String name;
    protected int age;
    String address;
    private int salary;

    
}
class Employee extends Person
{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Dilep";
        p1.age=21;
        p1.address="India";
        
    }
}
