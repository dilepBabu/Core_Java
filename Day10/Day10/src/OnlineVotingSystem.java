import java.util.Scanner;
import java.util.concurrent.*;

public class OnlineVotingSystem {
   static ConcurrentMap<String,Integer>concurrentMap=new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().split(" ");
        ExecutorService executorService=Executors.newFixedThreadPool(s.length);
        for (String string:s)
        {
            executorService.submit(new Voting(string));

        }
        executorService.shutdown();
        try
        {
            if(!executorService.awaitTermination(60, TimeUnit.SECONDS))
            {
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        display();

    }
    public static void display()
    {
        for(String vote:concurrentMap.keySet())
        {
            System.out.println(vote+": "+concurrentMap.get(vote));
        }
    }
    public static void count(String name)
    {
        concurrentMap.merge(name,1,Integer::sum);
    }
   public static class Voting implements Runnable
    {
        String name;
        Voting(String s)
        {
            this.name=s;
        }

        @Override
        public void run() {
            count(name);
        }
    }
}
