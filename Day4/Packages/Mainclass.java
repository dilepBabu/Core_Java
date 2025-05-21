import java.util.Scanner;


import Shapes.*;


public class Mainclass {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int radius=sc.nextInt();
        
        System.out.println(Circle.Area(radius));

        
    }
}