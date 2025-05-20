import java.util.Scanner;
class Ternary
{
public static void main(String abc[])
{

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String ans=((a%2==0)? "even number" : "odd number ");
System.out.print("the number is odd or even = "+ans);
sc.close();
}
}