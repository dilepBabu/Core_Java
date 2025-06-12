package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMaxList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int no=sc.nextInt();
        for (int i = 0; i < no; i++) {
            list.add(sc.nextInt());
        }
        int max=Collections.max(list);
        System.out.println("Maximum Element: "+max);
    }
}
