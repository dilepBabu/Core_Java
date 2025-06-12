package Day7;

import java.util.Arrays;

public class DistinctNumber {
    public static int missingno(int a[]) {
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            if (a[i+1] != a[i]+1) {
                return a[i]+1;
            }
        }
        return -1;
    }
        public static void main(String args[])
    {
        int a[]={0,3,1};



        System.out.println(missingno(a));

    }

}
