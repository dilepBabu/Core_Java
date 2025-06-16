package exercise;

import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(String str)
    {
        if(str==null)
        {
            throw new IllegalArgumentException("input is null");
        }
        String rev=new StringBuilder(str).reverse().toString();
        String pal="";
        return str.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println( palindrome("madam"));
    }
}
