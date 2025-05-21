package AccessModifiers;

import Shapes.Circle;

public class ProtectedOne {
    protected int i=10;

    
}
class Test extends Circle{

    public static void main(String[] args) {
        ProtectedOne one=new ProtectedOne();
        one.i=100;
        



        
    }
}
