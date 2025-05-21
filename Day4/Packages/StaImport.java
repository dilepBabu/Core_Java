import static java.lang.Math.sqrt;

import java.util.Scanner;

import static java.lang.Math.pow;

public class StaImport {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int pow=2;
        int b=sc.nextInt();
        double hypotenuse=sqrt((pow(a, pow)+pow(b, pow)));
        System.out.println(hypotenuse);
    }
}
