package Day5;
import java.time.zone.ZoneRulesException;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try 
        {
        int a=Integer.parseInt(sc.next());   
        int b=Integer.parseInt(sc.next());
            double ans=a/b;
            

        }
        catch (ZoneRulesException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error: Please enter valid integers.");
        }
        catch(Exception e)
        {
            System.out.println("An unexpected error occurred."+e.getMessage());
        }
    }
    
}
