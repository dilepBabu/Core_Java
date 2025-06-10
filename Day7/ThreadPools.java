package Day7;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable
{
    private int i;
    public Processor(int i)
    {
        this.i=i;
    }

    @Override
    public void run() {
        System.out.println(i);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("completed id "+i);
    }
}

public class ThreadPools {


    public static void main(String arsh[])
    {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executor.submit(new Processor(i));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
