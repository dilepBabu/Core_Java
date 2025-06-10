package Day7;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String argh[])
    {
        int a[]={1,2,4,24,3};
        int b[]= Arrays.copyOf(a,a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }




    }
}
