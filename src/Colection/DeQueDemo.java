package Colection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueDemo {
    public static void main(String[]args){
        Deque dq=new ArrayDeque();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        System.out.println(dq);
    }
}
