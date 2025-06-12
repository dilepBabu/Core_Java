<<<<<<< HEAD
package Excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylIst {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        List<String> remove=new ArrayList<>();

       Add(list,3);
       Remove(list,remove);
       Search(list,"Dilep");

    }
    public static void Remove(List list,List remove)
    {
        for (Object name:list)
        {
            if(!remove.contains(list))
            {
                remove.add(name);
            }
        }
    }
    public static void Search(List list,String name)
    {
       if (list.contains(name))
       {
           System.out.println("Index of the name in the list "+list.indexOf(name));
       }
       else {
           System.out.println("not found in list");
       }

    }
    public static void Add(List list,int size){


        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            list.add(sc.next());
        }
        for(Object name:list)
        {
            System.out.println(name);
        }
    }
}
=======
package Excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArraylIst {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        List<String> remove=new ArrayList<>();

       Add(list,3);
       Remove(list,remove);
       Search(list,"Dilep");

    }
    public static void Remove(List list,List remove)
    {
        for (Object name:list)
        {
            if(!remove.contains(list))
            {
                remove.add(name);
            }
        }
    }
    public static void Search(List list,String name)
    {
       if (list.contains(name))
       {
           System.out.println("Index of the name in the list "+list.indexOf(name));
       }
       else {
           System.out.println("not found in list");
       }

    }
    public static void Add(List list,int size){


        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            list.add(sc.next());
        }
        for(Object name:list)
        {
            System.out.println(name);
        }
    }
}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
