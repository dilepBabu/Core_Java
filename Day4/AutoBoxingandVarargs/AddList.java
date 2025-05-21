package AutoBoxingandVarargs;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        //Adding primitive int to list
        //AutoBoxing automatically convert the int into Integer
        l.add(10);// int 10 AutoBoxing into Integer.valueOf(10);
        l.add(20);
        l.add(30);
        l.add(40);
        int sum=0;
        for (Integer integer : l) {
            //Here UnBoxing : Integer convert int
            sum+=integer;
            
        }
     
    }
    
}
