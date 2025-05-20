package Overloading;

public class Employee {
    int id;
    String name;
    int salary;

    public void set(int setid, String setname, int setsalary) {
        this.id = setid;
        this.name = setname;
        this.salary = setsalary;
    }

    public void display() {
        System.out.println("Employee id is " + id + " and his name is " + name + " and salary is " + salary);
    }

}

class details {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.set(121, "Dilep Babu", 30000);
        emp1.display();
    }
}
