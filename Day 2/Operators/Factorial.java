import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        if (number == 0) {
            System.out.println(0);
        } else {
            for (int i = number; i >= 1; i--) {
                fact = fact * i;

            }
            System.out.println(fact);
        }
        sc.close();
    }
}
