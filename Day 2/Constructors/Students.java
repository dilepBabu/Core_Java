package Constructors;

class Students {
    int age;
    String name;

    public Students(String name, int age)

    {
        this.name = name;
        this.age = age;

    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Students s = new Students("Dilep Babu", 20);

        s.display();
    }

}
