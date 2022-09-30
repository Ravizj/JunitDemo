package Colection;

import java.util.Comparator;

public class ComparDemo implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2){
        return o1.name.compareTo(o2.name);
    }
    }
     class CompareSalery implements Comparator<Employee>{

         @Override
         public int compare(Employee o1, Employee o2) {
            if (o1.salery==o2.salery){
             return 0;

         }
            else if (o1.salery>o2.salery){
            return 1;
            }else {
                return -1;
            }
         }
     }

