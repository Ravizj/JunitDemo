package jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(10);
        System.out.println("Filter=========================");
        list.stream().filter(num->num%2==0).forEach(num-> System.out.println(num));
        list.stream().forEach(li-> System.out.println(li));
        System.out.println("map()==========================");

        List<Integer>sq=list.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(sq);
        System.out.println("sorted()========================");
        List res=list.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
        System.out.println("reduce()========================");
        int even=list.stream().filter(num->num%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);
    }
}
