package Day6;

public class SharedPrinter {

    private final Object ob1=new Object();
    private final Object ob2=new Object();
    private static int count =0;
    public synchronized void method1(String s)
    {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+s);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void method2(int i)
    {
        for (int j =i; j > 0; j--) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+j);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static synchronized void method3(String s)
    {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+s);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static synchronized void method4(int i)
    {
        for (int j =i; j > 0; j--) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+j);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void method5(String s)
    {
        synchronized (ob1) {
            for (int i = 0; i < 5; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + " " + s);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method6(int i)
    {
        synchronized (ob2)
        {

        for (int j =i; j > 0; j--) {
            count++;
            System.out.println(Thread.currentThread().getName()+" "+j);

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }

    public void method7(String s)
    {
        {
            for (int i = 0; i < 5; i++) {
                count++;

                System.out.println(Thread.currentThread().getName() + " " + s);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method8(int i)
    {

        {

            for (int j =i; j > 0; j--) {
                count++;
                System.out.println(Thread.currentThread().getName()+" "+j);

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String args[])
    {
        long start1=System.currentTimeMillis();

        SharedPrinter s1=new SharedPrinter();
        Thread th1=new Thread(()->{s1.method1("dilep");

        });
        th1.start();
        Thread th2=new Thread(()->{s1.method2(5);
        });
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end1=System.currentTimeMillis();
        long start2=System.currentTimeMillis();
        Thread th3=new Thread(()->SharedPrinter.method3("babu"));
        th3.start();
        Thread th4=new Thread(()->SharedPrinter.method4(5));
        th4.start();
        try {
            th3.join();
            th4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end2=System.currentTimeMillis();
        long start3=System.currentTimeMillis();
        SharedPrinter s3=new SharedPrinter();
        Thread th5=new Thread(()->s3.method5("block"));
        th5.start();
        Thread th6=new Thread(()->s3.method6(5));
        th6.start();
        try {
            th5.join();
            th6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end3=System.currentTimeMillis();
        long start4=System.currentTimeMillis();

        SharedPrinter s4=new SharedPrinter();

        Thread th7=new Thread(()->s4.method5("block"));
        th7.start();
        Thread th8=new Thread(()->s4.method6(5));
        th8.start();
        try {
            th7.join();
            th8.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end4=System.currentTimeMillis();
        System.out.println("sysn method"+" "+(end1-start1));
        System.out.println("static sysn method"+" "+(end2-start2));
        System.out.println("sysn block"+" "+(end3-start3));

        System.out.println("without sync"+" "+(end4-start4));
        System.out.println(count);



    }
}
