package Colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CompratorDemo {
    public static void main(String[]args){
        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee(101, "Usha",20000));
        list.add(new Employee(101, "Ravi",20000));
        list.add(new Employee(101, "Nikil",20000));
        list.add(new Employee(101, "Apoorva",20000));
        list.add(new Employee(101, "Namdev",20000));
        list.add(new Employee(101, "Divya",20000));
        list.add(new Employee(101, "kiran",20000));
        System.out.println("==================================");
        Collections.sort(list,new ComparDemo());

        Iterator<Employee>itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.hasNext());
        }

    }
}
