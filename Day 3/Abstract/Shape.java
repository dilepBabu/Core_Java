package Abstract;

public abstract class Shape {
    Shape()
    {

    }
   
    public abstract double calculateArea();
    
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    public double calculateArea()
    {
        return length*breadth;

    }
}
class Circle extends Shape
{ 
    int radious;

    Circle(int radious)
    {
        this.radious=radious;
    }
    public double calculateArea()
    {
        return 2*3.14*radious;
    }


}
class Area
{
    public static void main(String[] args) {
        Shape sp1=new Rectangle(2, 2);
        Shape sp2=new Circle(2);
        System.err.println("circle Area : "+sp2.calculateArea());
        System.out.println("Rectangle Area : "+sp1.calculateArea());
    }
}

