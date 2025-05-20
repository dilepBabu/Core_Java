package Inheritance;

public class Person
{
    int age;
   String name;

}
class Students extends Person {
    public int roll;
    public int marks;

    Students(String name, int age,int roll,int marks)
    {
       this.name=name;
       this.age=age;
        this.roll=roll;
        this.marks=marks;
    }
    public void display()
    {
      System.out.println("Student Name:"+name+" Age "+age+" Rollno : "+roll+" Marks :"+marks);
    }
    public static void main(String[] args) {
        Students st=new Students("Dilep",20, 21,8);
        st.display();

        
        
    }
    
}
