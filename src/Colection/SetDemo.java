package Colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[]args){
        Set s=new HashSet<>();
        s.add(20);
        s.add(10);
        s.add(100);
        s.add(10);
        s.add(null);
        System.out.println(s);
        s.remove(null);
        System.out.println(s);
        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.println(it.hasNext());
        }
    }
}
