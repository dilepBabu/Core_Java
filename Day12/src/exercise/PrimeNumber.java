package exercise;

import java.util.Scanner;

public class PrimeNumber {


    public static boolean prime(int i)
    {
        if(i<=1) return false;
        for (int j = 2; j <Math.sqrt(i); j++) {

            if(i%j==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        prime(sc.nextInt());
    }
}
