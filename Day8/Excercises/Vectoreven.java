package Excercises;

import java.util.Random;
import java.util.Vector;

public class Vectoreven {
    public static void main(String args[])
    {
        Vector <Integer> vector=new Vector<>();
        Random random=new Random();
        for (int i = 0; i < 20; i++) {
            vector.add(random.nextInt(100));
        }
        System.out.println(vector);
        Vector<Integer>vector1=new Vector<>();
        for (int i = 0; i < 20; i++) {
            if(vector.get(i)%2==0)
            {
                vector1.add(vector.get(i));
            }

        }
        System.out.println(vector1);
        Vector<Integer>vector2=(Vector<Integer>) vector1.clone();
        System.out.println(vector2);

    }
}
