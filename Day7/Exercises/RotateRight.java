package Day7.Exercises;

import java.util.Arrays;

public class RotateRight {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int k=3;
        while (k>0)
        {
            for (int i = 0; i < a.length; i++) {
                int temp=a[a.length-1];
                a[a.length-1]=a[i];
                a[i]=temp;
            }
            k--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }

    }

}
