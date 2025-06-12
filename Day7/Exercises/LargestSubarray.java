<<<<<<< HEAD
package Day7.Exercises;

public class LargestSubarray {
    public static void main(String[] aer) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max1=0,max2=0;
        for (int i = 0; i < a.length; i++) {
            max1=Math.max(a[i],max1+a[i]);
            max2=Math.max(max1,max2);
        }
        System.out.println(max2);
    }
}
=======
package Day7.Exercises;

public class LargestSubarray {
    public static void main(String[] aer) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max1=0,max2=0;
        for (int i = 0; i < a.length; i++) {
            max1=Math.max(a[i],max1+a[i]);
            max2=Math.max(max1,max2);
        }
        System.out.println(max2);
    }
}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
