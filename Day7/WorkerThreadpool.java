package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkerThreadpool implements Runnable {

    private Random random=new Random();
    private Object object1=new Object();
    private Object object2=new Object();
    private List<Integer>l1=new ArrayList<>();
    private List<Integer>l2=new ArrayList<>();

    public void run()
    {
        process();

    }
    public void process()
    {
        for (int i = 0; i < 1000; i++) {
            stageone();
            stagetwo();
        }

    }
    public void stageone()
    {
        synchronized (object1)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            l1.add(random.nextInt(100));
        }

    }
    public void stagetwo()
    {
        synchronized (object2)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            l2.add(random.nextInt(100));
        }

    }



    public  static void main(String args[])
    {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        System.out.println("Starting");
       long start=System.currentTimeMillis();
        WorkerThreadpool workerThreadpool=new WorkerThreadpool();
        for (int i = 0; i < 2; i++) {
            executorService.submit(workerThreadpool);

        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       long end= System.currentTimeMillis();
        System.out.println("time taken "+(end-start));
        System.out.println(workerThreadpool.l1.size()+" "+workerThreadpool.l2.size());
    }
}
