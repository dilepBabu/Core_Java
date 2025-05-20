import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(number1 + number2);

                break;
            case "-":
                System.out.println(number1 - number2);

                break;
            case "*":
                System.out.println(number1 * number2);

                break;
            case "/":
                System.out.println(number1 / number2);

                break;
            case "%":
                System.out.println(number1 % number2);

                break;
            default:
                System.out.println("invalid op");
                break;
        }
        sc.close();
    }

}
