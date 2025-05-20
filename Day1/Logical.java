import java.util.Scanner;
class Logical
{
public static void main(String abc[])
{
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();

if(a>b)
{
System.out.print("a is greater");
}
else if(a<b)
{
System.out.print("b is greater");
}
 
else
{
System.out.print("a and b are equal");
}
if((a>0)&&(b>0))
{
System.out.print("Both number is positive");
}
sc.close();
}
}