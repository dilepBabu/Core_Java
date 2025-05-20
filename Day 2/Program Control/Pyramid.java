import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("^");
            }
            for (int l = number - i; l >= 0; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
