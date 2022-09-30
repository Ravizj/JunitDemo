package ExceptinH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptinPrpogetion {
    public void show()throws FileNotFoundException {
        int num=5;
        int res=5/0;

        //FileInputStream fis = new FileInputStream("abc.txt");
    }
    public void display() throws FileNotFoundException {
        show();
    }
    public void print() {
        try {
            display();
        } catch (Exception e) {
            System.out.println("Exciption");
        }
    }
    public static void main(String[]args){
        ExceptinPrpogetion ep=new ExceptinPrpogetion();
        ep.print();
        System.out.println("Hi");
    }
}
