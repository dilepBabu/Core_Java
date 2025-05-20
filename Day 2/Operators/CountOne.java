import java.util.Scanner;

public class CountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String Binary = "";
        int count = 0;
        int n = number;
        while (n > 0) {
            int remainder = n % 2;
            if (remainder == 1) {
                count++;
            }
            Binary = remainder + Binary;
            n = n / 2;

        }
        System.out.println(number + " binary number is " + Binary + " and numberof one is " + count);
        sc.close();
    }

}
