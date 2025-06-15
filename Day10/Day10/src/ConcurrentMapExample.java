import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {

    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer>concurrentHashMap=new ConcurrentHashMap<String, Integer>();
        concurrentHashMap.put("one",1);
        concurrentHashMap.put("two",2);
        concurrentHashMap.put("Three",3);
        concurrentHashMap.put("four",4);
        concurrentHashMap.put("five",5);
        Iterator <String> iterator=concurrentHashMap.keySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(concurrentHashMap);





    }
}
