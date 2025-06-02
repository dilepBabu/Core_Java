package Day5;
import java.lang.Math;
public class Langclass {

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        long startnano=System.nanoTime();
        int a=5;
        int b=10;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 2));
        System.out.println(Math.max(a, b));

        String name="dilep";
        String uname="";
        int length=name.length();
        
        for (int i = 0; i < length; i++) {
            
            char ch[]=name.toCharArray();
            uname+=Character.toUpperCase(ch[i]);
            
            
        }
        System.out.println(uname);
        long end=System.currentTimeMillis();
        long endnano=System.nanoTime();
            
            System.out.println(end-start);
            System.out.println(endnano-startnano);
        
    }
}
