package OOPS_Basics;

public class Calculator {
    public int add(int number1,int number2 )
    {
        return number1+number2;
        

    }
    public double add(double number1,double number2)
    {
        return number1+number2;  
    }
    public int add(int[] numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum=sum+numbers[i];

        }
        return sum;
    }
 
    
}
class Solution
{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(2,2 ));
        System.out.println(c1.add(2.00,2.0));
        System.out.println(c1.add(new int[]{1,2,3,4,5}));

    }
}
