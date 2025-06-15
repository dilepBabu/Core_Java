package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Name To add");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            set.add(sc.nextLine());
        }
        System.out.println("Unique Names: "+set);

    }
}
