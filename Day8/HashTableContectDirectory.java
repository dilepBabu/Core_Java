import java.util.Hashtable;
import java.util.Scanner;

public class HashTableContectDirectory {

    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Long>h=new Hashtable<>();
        for (int i = 0; i <3 ; i++) {
            h.put(sc.next(),sc.nextLong());
        }


        System.out.println("Contact Directory :"+h);
        System.out.println("Search Result :"+h.get(sc.next()));

        h.remove(sc.next());
        System.out.println("After Removal");
        System.out.println(h);








//        h.put(1,"dilep");
//        h.put(2,"dilep");
//        System.out.println(h.get(1));
//        System.out.println(h.get(2));
//
//        int h1=Integer.valueOf(1).hashCode();
//        int h2=Integer.valueOf(2).hashCode();
//        System.out.println(h1+" "+h2);
    }
}
