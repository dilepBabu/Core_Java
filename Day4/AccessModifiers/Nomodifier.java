package AccessModifiers;

import Shapes.Circle;

public class Nomodifier extends Circle {
    public static void main(String[] args) {
        //Circle.test = 10;
        // Its shows error because diff package with subclass  and non sub class have no permission to access the default varible 
        System.out.println();
    }
    
}
