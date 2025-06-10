package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class SyncBlock {

    private Random random=new Random();

    private final Object object1=new Object();
    private final Object object2=new Object();

    private List<Integer>list1=new ArrayList();
    private List<Integer>list2=new ArrayList();
    public void stageone()
    {
        synchronized (object2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }
    public void stagetwo()
    {
        synchronized (object1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list2.add(random.nextInt(100));
        }
    }
    public void process()
    {
        for (int i = 0; i < 1000; i++) {
            stageone();
            stagetwo();

        }

    }
    public void main()
    {
        long start=System.currentTimeMillis();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endtime=System.currentTimeMillis();
        System.out.println(endtime-start);
        System.out.println(list1.size()+" "+list2.size());
    }



}
