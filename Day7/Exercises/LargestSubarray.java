package Day7.Exercises;

import java.util.Arrays;

public class LargestSubarray {
    public static void main(String aer[])
    {
        int max=Integer.MIN_VALUE,sum=0;

        int a[]={-2, 1, -3, 4, -1, 2, 1, -5, 4 };

        for (int i = 0; i <a.length; i++) {
            int temp=0;
            for (int j = 0; j <=i; j++) {
                temp+=a[j];
            }
            sum=temp;

            if(max<sum)
            {
                max=sum;
            }


        }
        System.out.println(max);
    }
}
