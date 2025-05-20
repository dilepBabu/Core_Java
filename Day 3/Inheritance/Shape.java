package Inheritance;


public class Shape {

    public double Area()
    {
        return 0.0;

    }
    
}
class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public double Area()
    {

        return length*breadth;

    }
    
}
class Square extends Rectangle{
    Square(double area)
    {
        super(area,area);
    }

}
class Answer
{
    public static void main(String[] args) {
        Rectangle re=new Rectangle(4.0,2.0);
        Square sq=new Square(2.0);
        System.out.println("Area of Square "+sq.Area());
        System.out.println("Area of Rectangle "+re.Area() );
        
    }

    

    
    
}
