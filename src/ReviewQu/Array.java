package ReviewQu;

import java.util.Scanner;

public class Array {

    public void DataArray(){
        int n;
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter the array number: ");
        n=arr.nextInt();
        int[] array=new int[10];
        System.out.println("Enter the Array Element");
        for (int i=0;i<n;i++){
            array[i]=arr.nextInt();

        }
        System.out.println("element are");
        for (int i=0;i<n;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Array d=new Array();
        d.DataArray();

    }
}
