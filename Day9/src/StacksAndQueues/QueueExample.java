package StacksAndQueues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String>queue=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        String[]cname=sc.nextLine().split(",");
        for (int i = 0; i < cname.length; i++) {
            queue.add(cname[i]);

        }
        int service=sc.nextInt();
        while (service!=0)
        {
            System.out.println("Serving: "+ queue.poll());
            service--;
            System.out.println("Waiting: "+queue);
        }
    }
}
