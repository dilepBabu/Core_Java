package exercise;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        String rev= String.valueOf(sb.reverse());
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println( reverse(scanner.nextLine()));
    }
}
