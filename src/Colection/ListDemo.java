package Colection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[]aegs){

        List list= new ArrayList<>();
        list .add(10);
        list.add(20);
        list.add(30);
        list.add(1,30);
        System.out.println(list);
        list.remove(20);
        System.out.println(list.contains(10));
        System.out.println(list.isEmpty());

        List list1 =new ArrayList();
        System.out.println(list.hashCode());
        list1.add(100);
        list1.add(200);
        System.out.println(list1);
        list1.addAll(list);
        System.out.println(list1);
        list1.retainAll(list);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
        System.out.println(list.get(2));
    }
}
