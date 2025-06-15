package Map;

import java.util.*;

public class StudentManage {
    public static void main(String[] args) {
        Map<String,Integer>details=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of student details To add ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            System.out.println("enter the name");
            String name=sc.nextLine();
            System.out.println("enter the grade");
            int grade=sc.nextInt();
            sc.nextLine();
            details.put(name, grade);
        }
        System.out.println(details);
        System.out.println("Enter the name and grade to update");
        String update=sc.nextLine();
        int ugrade=sc.nextInt();
        sc.nextLine();

        details.put(update,ugrade);
        System.out.println("enter to retrieve st details");
        String rname=sc.nextLine();
        if(details.containsKey(rname))
        {
            System.out.println(rname+" grade: "+details.get(rname));
        }
        System.out.println("All students and grades:");
        Set<String>key=details.keySet();
        Collection<Integer>value=details.values();
        Iterator<String>k= key.iterator();
        Iterator<Integer>v=value.iterator();
        while (k.hasNext())
        {
            System.out.println(k.next()+": "+v.next());
        }


    }
}
