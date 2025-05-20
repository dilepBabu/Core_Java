package Practice;

/*SUPER CLASS */
public class ObjSubstitution {
    int i=10;
 

    public void del()
    {
        System.out.println("super class");
    }

    
}

class Obj extends ObjSubstitution{
    int i=100;
    public void del()
    {
        System.out.println("subclass");
    }

    public static void main(String[] args) {
           /*
     * 
     * in object substitution 
     * we have super class and subclass in the we can create the varible with same name 
     * in this object substitution the object refers the super varible only not the subclass varible and it only refer the subclass method only  
     */
        ObjSubstitution obj=new Obj();
        System.out.println(obj.i);
        obj.del();
        /*
         * instanceOf
         * it will return true or false
         * syntax 
         * "(object instabceof class name)"
         */
        System.out.println(obj instanceof Obj);
        
    }
}
