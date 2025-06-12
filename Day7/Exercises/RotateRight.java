<<<<<<< HEAD
package Day7.Exercises;

import java.util.Arrays;

public class RotateRight {

    public static void main(String args[]) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        right(a,k);
        System.out.println("Right Rotation "+Arrays.toString(a));

        int b[]={1,2,3,4,5,6,7};
        int l=3;
        left(b,l);
        System.out.println("Left Rotation "+Arrays.toString(b));
    }

    private static void right(int[] a, int k) {
        int n=a.length;
        k=k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    public static void left(int []a,int k)
    {
        int n=a.length;
        k=k%n;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);

    }
    public static void reverse(int []a,int st,int end)
    {
        while ((st<end))
        {
            int temp=a[st];
            a[st++]=a[end];
            a[end--]=temp;
        }
    }

}
=======
package Day7.Exercises;

import java.util.Arrays;

public class RotateRight {

    public static void main(String args[]) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        right(a,k);
        System.out.println("Right Rotation "+Arrays.toString(a));

        int b[]={1,2,3,4,5,6,7};
        int l=3;
        left(b,l);
        System.out.println("Left Rotation "+Arrays.toString(b));
    }

    private static void right(int[] a, int k) {
        int n=a.length;
        k=k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    public static void left(int []a,int k)
    {
        int n=a.length;
        k=k%n;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);

    }
    public static void reverse(int []a,int st,int end)
    {
        while ((st<end))
        {
            int temp=a[st];
            a[st++]=a[end];
            a[end--]=temp;
        }
    }

}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
