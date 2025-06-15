import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

class Employee{

}
public class WeakReferenceExample {
    public static void main(String[] args) throws InterruptedException{
        HashMap<Employee,String>hashMap=new HashMap<>();
        Employee emp=new Employee();
        String s="Programmer";
        hashMap.put(emp,s);
        emp=null;
        System.gc();
        System.out.println(hashMap.size());

        WeakHashMap<Employee,String>weakHashMap=new WeakHashMap<>();
        Employee employee=new Employee();
        weakHashMap.put(employee,s);
        employee=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(" "+weakHashMap.size());
        HashMap<String,Integer>newh=new HashMap<String,Integer>();
        WeakReference<HashMap<String,Integer>>weakReference=new WeakReference<HashMap<String,Integer>>(newh);
        newh=null;
        System.gc();
        System.out.println(weakReference.get());


    }
}
