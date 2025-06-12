<<<<<<< HEAD
package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<String>list=new ArrayList<>();
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.println("Remove any Item from the List type index Number");
        list.remove(sc.nextInt());
        System.out.println(list);
    }
}
=======
package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<String>list=new ArrayList<>();
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.println("Remove any Item from the List type index Number");
        list.remove(sc.nextInt());
        System.out.println(list);
    }
}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
