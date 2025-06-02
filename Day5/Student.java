package Day5;



    
public class Student implements Cloneable
{
    int age ;
    String name;
    Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    public int getage(int age)
    {
        return age;
    }
    public String getname(String name)
    {
        return name;
    }
    public static void main(String[] args) {
        try{
         Student s1=new Student("dilep",21);
         
         Student s2=(Student)s1.clone();
         System.out.println(s1.age+" "+s1.name);
        
         System.out.println(s2.age+" "+s2.name);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}

    

