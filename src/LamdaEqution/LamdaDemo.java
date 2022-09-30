package LamdaEqution;

import org.junit.runner.Result;

@FunctionalInterface
    interface Operation{
        void add(int a,int b);

    }
    @FunctionalInterface
    interface Printable{
        String print(String name);
    }
    @FunctionalInterface
    interface Subtact{
        void add(int x,int y);
    }
    @FunctionalInterface
    interface Multi{
    void add(int x,int y);
}
public class LamdaDemo {
        public static void main(String[]args){
            Operation op=(num1,num2)->{
                int res=num1+num2;
                System.out.println("Result: "+res);
            };
            op.add(10,20);
            Printable p=(name)->{
                return "Hello "+name;
            };
            System.out.println(p.print("Ravi"));
            Subtact sub=(num1,num2)->{
              int Result = num1-num2;
                System.out.println("Subtrctoin "+Result);
            };sub.add(30,12);
            Multi m=(num1,num2)->{
                int Result = num1*num2;
                System.out.println("Multi :"+Result);
            };m.add(34,54);
        }


}
