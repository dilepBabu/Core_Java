import java.util.Scanner;

public class LargestNumber {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        int a=(number1>number2 )? ((number1>number3)?number1:number3):((number2>number3)?number2:number3); 
        System.out.println("largest number "+a);
        sc.close();

    }
    
}
