package Day7.Exercises;

import java.util.Arrays;

public class GreaterElement {
    public static int[] find(int []a)
    {
        int len=a.length;
        int result[]=new int[len];
        for (int i = 0; i < a.length; i++) {
            result [i]=-1;
            for (int j = i+1; j <len ; j++) {
                if(a[j]>a[i])
                {
                    result[i]=a[j];
                    break;
                }

            }

        }
        return result;
    }
    public static void main(String args[]){
        int a[]={5,5,2,10};
        int ans[]=find(a);
        System.out.println((Arrays.toString(ans)));

    }
}
