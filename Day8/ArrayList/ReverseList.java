<<<<<<< HEAD
package ArrayList;

import java.util.*;

public class ReverseList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the size of list");
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            list.add(sc.nextInt());
        }


        System.out.println("Original "+list);
        Collections.reverse(list);
        System.out.println("reversed "+list);
    }
}
=======
package ArrayList;

import java.util.*;

public class ReverseList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the size of list");
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            list.add(sc.nextInt());
        }


        System.out.println("Original "+list);
        Collections.reverse(list);
        System.out.println("reversed "+list);
    }
}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
