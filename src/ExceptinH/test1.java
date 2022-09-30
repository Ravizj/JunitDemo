package ExceptinH;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        System.out.println("Wlcomme");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res =0;
        try {
            res=num1/num2;
            System.out.println("Result:"+res);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Result"+res);
            System.out.println("Hi");
        }
        System.out.println("Hello");
        System.out.println("abc");
    }
}
