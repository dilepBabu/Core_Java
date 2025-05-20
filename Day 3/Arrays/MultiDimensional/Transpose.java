package MultiDimensional;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        int transpose[][]=new int[row][col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
             a[i][j]=sc.nextInt();   
            }   
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                transpose[j][i]=a[i][j];
                
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(transpose[i][j]+" ");
                
            }
            System.out.println();
        }
        sc.close();
    
}
}
