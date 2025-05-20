package Polymorphism;


class Triangle {

    public double area(double base, double height) {
        return (base * height) / 2;
    }

}

class Squares {
    public double area(int radius) {
        return 2 * 3.14 * radius;

    }

}

class Rectangle {
    public int area(int length, int width) {
        return length * width;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Rectangle ans1 = new Rectangle();
        Triangle ans2 = new Triangle();
        Squares ans3 = new Squares();
        System.out.println(ans1.area(2, 2));
        System.out.println(ans2.area(2.0, 4.0));
        System.out.println(ans3.area(3));
    }

}
