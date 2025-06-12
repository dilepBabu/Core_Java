<<<<<<< HEAD
package Day6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptiontwo {

    public static void main(String[] args) {
        Exceptiontwo ex=new Exceptiontwo();
        ex.getnum();
        
    }
    public void getnum() {
        Scanner sc =new Scanner(System.in);
        try {
        int a=sc.nextInt();
        int b=sc.nextInt();
            System.out.println(a/b);
      
    }
    catch(ArithmeticException exception)
    {
        System.out.println("Division by zero is not allowed.");
    }
    catch(InputMismatchException e)
    {
        System.out.println("Invalid input. Please enter numeric values.");

    }
    catch(Exception e)
    {
        System.out.println("An error occurred:"+e.getMessage() );
    }
}
}
=======
package Day6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptiontwo {

    public static void main(String[] args) {
        Exceptiontwo ex=new Exceptiontwo();
        ex.getnum();
        
    }
    public void getnum() {
        Scanner sc =new Scanner(System.in);
        try {
        int a=sc.nextInt();
        int b=sc.nextInt();
            System.out.println(a/b);
      
    }
    catch(ArithmeticException exception)
    {
        System.out.println("Division by zero is not allowed.");
    }
    catch(InputMismatchException e)
    {
        System.out.println("Invalid input. Please enter numeric values.");

    }
    catch(Exception e)
    {
        System.out.println("An error occurred:"+e.getMessage() );
    }
}
}
>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
