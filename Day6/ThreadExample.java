package Day6;

import java.nio.channels.UnresolvedAddressException;
import java.security.UnresolvedPermission;

import javax.management.IntrospectionException;

class Number extends Thread implements Runnable{

    Number()
    {
       
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println(i+" ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
            
        }
    }

}
class Square extends Thread implements Runnable{
  
    Square()
    {
        
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println(i*i+" ff");
            try {
                 Thread.sleep(500);
               
            } catch (InterruptedException e) {
       
                e.printStackTrace();
            }
           
            
        }
    }

}

public class ThreadExample extends Thread{
  
    public static void main(String[] args) {
        Thread one=new Thread(new Number());
         System.out.println(Thread.currentThread());
        Thread two=new Thread(new Square()); 
try {
    one.join();
    
} catch (InterruptedException e) {
    
    e.printStackTrace();
}

  
     
    }
    
}
