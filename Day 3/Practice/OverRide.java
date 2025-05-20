package Practice;

/* super class */
public class OverRide {
    int a=10;

    public void Defaultmethod() {
        System.out.println("Default method");
    }

    public String name()
    {
        return "dilep";
    }

    public String getString() {
        return name();
    }

}

/*
 * public > protected >Default > private
 * 
 */
class Example extends OverRide {
    int i=100;
    
    @Override
    public void Defaultmethod() {
       int b= super.a;
        System.out.println("Override method");
        System.out.println(b);
    }

    public String getname() {

        return "1";
    }

    @Override
    public String getString() {
        return "this is override" + super.getString() + getname();
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.Defaultmethod();
        System.out.println(ex.getString());
        

    }

}
