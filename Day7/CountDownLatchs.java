package Day7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ProcesserCount implements Runnable
{
    private CountDownLatch latch;
    ProcesserCount(CountDownLatch latch)
    {
        this.latch=latch;
    }
    public void run()
    {
        System.out.println("Started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        latch.countDown();
    }}
public class CountDownLatchs {



    public static void main(String args[])
    {
        CountDownLatch latch=new CountDownLatch(3);
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new ProcesserCount(latch));
        }
        executorService.shutdown();
        try {
            latch.await();
        } catch (InterruptedException e) {

        }

        System.out.println("completed");
    }
}
