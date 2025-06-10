package Day6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Reflects {

    public static void main(String[] args) {
        try {
            Class cls=Class.forName("Day6.Person");

            //Constructor
            Constructor con[]=cls.getDeclaredConstructors();
            for (int i = 0; i < con.length; i++) {
                System.out.println(con[i]);
            }


            //Fields
            Field field[]=cls.getDeclaredFields();
            for (int i = 0; i < field.length; i++) {
                System.out.println(field[i]);
            }

            //methods

            Method method[]=cls.getDeclaredMethods();
            for (int i = 0; i < method.length; i++) {
                System.out.println(method[i]);
            }
            Person p1=(Person)con[1].newInstance(21,"dilep");
            for (int i = 0; i < method.length; i++) {
                if(method[i].getName().indexOf("namestr")!=-1)
                {
                   
                    method[i].invoke(p1);
                }
            }
//Pass as parameter
            Object obj=cls.getDeclaredConstructor().newInstance();
            Method methods=cls.getMethod("setname", String.class);
            Object obj1=methods.invoke(obj, "BABU");
           System.out.println(obj1);




        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
