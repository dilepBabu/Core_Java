package exercise;

public class Factorial {
    public static int factorial(int n)
    {
        int result=1;
        if(n<0) {throw new IllegalArgumentException("negative number");}

        for (int i = 2; i <= n; i++) {
            result *=n;
        }
        return result;
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
