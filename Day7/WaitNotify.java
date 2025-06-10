package Day7;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

class Processors
{
    public void producer() throws InterruptedException
    {
       synchronized (this){System.out.println("starting the producer and running");
        wait();
        System.out.println("Resumed");}

    }
    public void consumer() throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this)
        {
            System.out.println("wait for return key");
            sc.nextLine();
            System.out.println("return key pressed");
            notify();
            Thread.sleep(5000);
            System.out.println("consumption done");
        }

        System.out.println();
    }

}

public class WaitNotify {
public static void main(String args[]) throws InterruptedException{
    Processors processors=new Processors();
    Thread th1=new Thread(()-> {
        try {
            processors.producer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });


    Thread th2=new Thread(()-> {
        try {
            processors.consumer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    th1.start();
    th2.start();
    th1.join();
    th2.join();

}



}
