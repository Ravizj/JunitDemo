package ReviewQu;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[]args){
        int[] a={1,2,4,5,6};
        int[] b=a;
        //print first array a
        System.out.println("Array a="+Arrays.toString(a));
        //print coped Array b
        System.out.println("array b="+Arrays.toString(b));


       // System.out.println("Array 2 "+ Arrays.stream(b).toArray());
    }

}
