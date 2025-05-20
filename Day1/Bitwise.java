import java.util.Scanner;
class Bitwise{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int left=a<<2;
int right=a>>2;
int b=sc.nextInt();
int c=sc.nextInt();
System.out.print("left shift = "+left+" Right = "+right);
int xor=b^c;
System.out.print(" Xor = "+xor);
sc.close();
}
}