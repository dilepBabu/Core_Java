package Excercises;

import java.util.Hashtable;
import java.util.Scanner;

public class StudentMarkTable {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Integer> details=new Hashtable<>();
        for (int i = 0; i < 2; i++) {
            details.put(sc.next(), sc.nextInt());
        }
        System.out.println("enter the name to search in the list");
        String name=sc.next();
        if(details.containsKey(name))
        {
            System.out.println(details.get(name));
        }else {
            System.out.println("student not found");
        }
        System.out.println("update mark enter the student name and update mark");
        String names=sc.next();
        int update=sc.nextInt();
        if(details.containsKey(names))
        {
            details.put(names,update);
        }
        System.out.println("enter the name remove the student fromm the list ");
        String rname=sc.next();
        if(details.containsKey(rname))
        {
            details.remove(rname);
        }
        System.out.println("List of students"+details);
    }
}
