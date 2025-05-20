import java.util.Scanner;

public class LandSNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int max=0,min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
            
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
        sc.close();
    }
    
}