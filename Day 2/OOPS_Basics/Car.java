package OOPS_Basics;

public class Car {
    String brand;
    String model;
    int price;
    double discountprice;

    public void set(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void calculate() {
        int discount = 20;
        discountprice = price - (discount * (20 / 100.0));

    }

    public void display() {
        System.out.println(brand + " " + model + " " + discountprice);

    }

}

class Ans {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.set("hundai", "I20", 200000);
        car1.calculate();
        car1.display();

    }
}