<<<<<<< HEAD
package Day6;
public class Sysc
{

    private int count=0;
    public synchronized void increment() throws InterruptedException  {
        count++;

    }
    public void dowork()  {
        {
            Thread th1=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20000; i++) {
                        try {
                            increment();

                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }

                    }
                }


            });
            th1.start();

            Thread th2=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20000; i++) {
                        try {
                            increment();


                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }

                    }
                }


            });
            th2.start();

            try {
                th1.join();
                th2.join();
            } catch (InterruptedException ignored) {

            }
            System.out.println(count);



        }
    }



    public static void main(String args[]) {
        Sysc sysc = new Sysc();
        sysc.dowork();




    }

=======
package Day6;
public class Sysc
{

    private int count=0;
    public synchronized void increment() throws InterruptedException  {
        count++;

    }
    public void dowork()  {
        {
            Thread th1=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20000; i++) {
                        try {
                            increment();

                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }

                    }
                }


            });
            th1.start();

            Thread th2=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20000; i++) {
                        try {
                            increment();


                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }

                    }
                }


            });
            th2.start();

            try {
                th1.join();
                th2.join();
            } catch (InterruptedException ignored) {

            }
            System.out.println(count);



        }
    }



    public static void main(String args[]) {
        Sysc sysc = new Sysc();
        sysc.dowork();




    }

>>>>>>> 4898debd3e0e4d3741ae4adb33268d654de3892e
}