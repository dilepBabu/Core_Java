class Primitive
{
public static void main(String sa[])
{
byte b=100;
short s=20;
int i=200;
long l=20;
char c='a';
float f=12.9f;
double d=12.8;

System.out.println(b+" "+s+" "+i+" "+l+" "+c+" "+f+" "+d);
int convert=(int)(d);
System.out.println("Type conversion "+convert);
int fconvert=(int)(f);
System.out.print("float to int converted "+fconvert+"\n"+"float value "+f);
}}