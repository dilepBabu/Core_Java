package Day7;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Locks{
    private static int count=0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void increment()
    {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
    public void firstThread() throws InterruptedException
    {
        lock.lock();
        System.out.println("Waiting..");
        condition.await();
       try {
           increment();
       }finally {
           lock.unlock();
       }
    }
    public void secondThread() throws InterruptedException
    {
        Thread.sleep(2000);
        lock.lock();
        new Scanner(System.in).nextLine();
        condition.signal();
        try {
            increment();
            System.out.println("got the key");
        }finally {
            lock.unlock();
        }


    }
    public static void counts()
    {
        System.out.println(count);
    }
}
public class ReentranLock extends Locks{
    public static void main(String []args) throws InterruptedException
    {
        Locks locks=new Locks();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    locks.firstThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    locks.secondThread();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        counts();
    }
}
