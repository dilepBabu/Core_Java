package MultiDimensional;

import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
             a[i][j]=sc.nextInt();   
            }   
        }
        int b[][]=new int[size][size];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j]=sc.nextInt();
                
            }
            
        }
        int add[][]=new int[size][size];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                add[i][j]=a[i][j]+b[i][j];
                System.out.print(add[i][j]+" ");
                }
                System.out.println();
        }
        sc.close();
    
}
}
