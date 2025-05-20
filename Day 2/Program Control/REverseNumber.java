import java.util.Scanner;

public class REverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String ans = "";
        int n = number;
        while (n > 0) {
            int rev = n % 10;
            ans = ans + rev;
            n = n / 10;

        }
        System.out.println(number + " reverse number is " + ans);
        sc.close();

    }

}
