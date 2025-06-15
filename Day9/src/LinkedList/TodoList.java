package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    public static void main(String args[])
    {
        List<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Tasks To add");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            list.add(sc.nextLine());
        }
        System.out.println(list);
        System.out.println("If You wants to remove the task enter the Task");
        list.remove(sc.nextLine());
        System.out.println(list);
        int i=0;
        System.out.println("Tasks List:");
        for (String str: list)
        {

            System.out.println(++i+"."+str);
        }

    }
}
