package jdk8;

import java.util.ArrayList;

public class Employee1 {
    int id;
    String name;
    int salery;
    public Employee1(int id,String name,int salery){
        super();
        this.id=id;
        this.name=name;
        this.salery= salery;
    }
    public static void main(String[]args){
        ArrayList<Employee1> emp=new ArrayList<>();
        emp.add(new Employee1(101,"Ravi",25000));
        emp.add(new Employee1(102,"Rita",15000));
        emp.add(new Employee1(103,"Divya",35000));
        emp.add(new Employee1(104,"Ram",22000));
        emp.add(new Employee1(105,"Gita",50000));
        emp.add(new Employee1(106,"Karuna",95000));
        emp.add(new Employee1(106,"Namdev",25000));

        Employee1 maxSal=emp.stream().max((emp1,emp2)->emp1.salery>emp2.salery?1:-1).get();
        System.out.println("Maximum Salery===="+maxSal.salery);

        Employee1 minSalery=emp.stream().min((emp1,emp2)->emp1.salery>emp2.salery?1:-1).get();
        System.out.println("Minumum Salery======"+minSalery.salery);
    }
}
