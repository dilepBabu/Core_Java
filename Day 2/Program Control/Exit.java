import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        while (b != true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            } else {
                b = false;
            }
            sc.close();

        }

    }
}
