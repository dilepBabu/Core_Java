package Day5;

import java.io.IOException;

public class Runtimeexample {


    public static void main(String[] args)  {
        
        long start=System.currentTimeMillis();
        long startnano=System.nanoTime();
        Runtime r1=Runtime.getRuntime();
        int pro=r1.availableProcessors();
        System.out.println(r1.freeMemory()+" "+r1.maxMemory());
        
        System.out.println(pro);

        try {
            Process p1=r1.exec("notepad");
            p1.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        // in one line we can copy the array using the system
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        long end=System.currentTimeMillis();
        long endnano=System.nanoTime();
        System.out.println(end-start);
        System.out.println(endnano-startnano);


    }
    

}
