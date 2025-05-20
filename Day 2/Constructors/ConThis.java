package Constructors;

public class ConThis {

    public ConThis()
    {
        System.out.println("no arg constructor");
    }
    public ConThis(int i)
    {
        this();
        System.out.println("one arg constructor");
    }
    public ConThis(int i,int j)
    { 
        this(i);
        System.out.println("two arg constructor");
    }
    public static void main(String[] args) {
        ConThis co=new ConThis(0, 0);
        
    }
    
}
