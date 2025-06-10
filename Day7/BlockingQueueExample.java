package Day7;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    private static BlockingQueue<Integer> b=new ArrayBlockingQueue<>(10);
    public static void main(String args[]) throws InterruptedException
    {
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th1.start();
        th2.start();

        Thread.sleep(3000);
        System.exit(0);

    }
    private static void producer() throws InterruptedException
    {
        Random r=new Random();

        while (true)
        {
            b.put(r.nextInt(100));
        }

    }
    private  static void consumer() throws InterruptedException
    {
        Random r=new Random();
        while (true)
        {
            Thread.sleep(100);
            if(r.nextInt(10)==0)
            {
            Integer value=b.take();
                System.out.println("taken value "+value+" queue size "+b.size());
            }
        }

    }
}
