package ExceptinH;

public class DemoExp {
    public static void main(String[]args){

        int num=10;
        int[] a= {1,2,3};
        String Str=null;
        try {
            System.out.println("Hi");
            System.out.println(Str.length());
            int res=num/0;
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("ArithmeticException");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
