import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =9;
        boolean istrue=true;
        if (number<=1)
        {
            istrue=false;
        }
        else{
        for (int i=2;i<(Math.sqrt(number)+1);i++)
        {
            if(number%i==0)
            {
                istrue=false;
                 break;    
            }
        } 
 
    }
    if(istrue)
    {
        System.out.println(number+" is prime");
    }
    else{
        System.out.println(number+" is not prime");
    }
    sc.close();
}
    
}
