package Day6;

public class Person {
    int id;
    String name;
    Person()
    {

    }
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void  namestr()
    {
        System.out.println(name);
    }
    public String setname(String setname)
    {
        this.name=setname;
       return name;
    } 
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
}
