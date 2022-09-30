package Colection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void manin(String[]args){
        Queue q=new PriorityQueue<>();
        q.add(10);
        q.add(100);
        q.add(40);
        q.add(null);
        q.add(100);
        System.out.println(q);
        System.out.println(q.poll());
        q.remove(40);
        System.out.println(q);
    }
}
