import java.util.*;

public class VectorStManagement {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=0,min=Integer.MAX_VALUE,sum=0,get=0,avg=0;
        Vector<Integer> vector=new Vector<>();
        for (int i = 0; i < 5; i++) {
            vector.add(sc.nextInt());
        }
        vector.remove(sc.nextInt());


        for (int i = 0; i < vector.size(); i++) {
            get=vector.get(i);
            max=Math.max(get,max);
            min=Math.min(get,min);
            sum+=get;
        }


        System.out.println("Grades "+vector);
        System.out.println("Max Grade "+max);
        System.out.println("Min Grade "+min);
        System.out.println("Avg Grade "+sum/vector.size());


        Collections.sort(vector);
        System.out.println(vector);


    }
}
