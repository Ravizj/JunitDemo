package DataStractur;

import java.util.*;
class StringsPalidrom

{
    public void Palidrom(){
        String reverse="";
        Scanner w=new Scanner(System.in);
        System.out.println("Enter the String");
        String MainWord=w.nextLine();
        System.out.println("original string is :"+MainWord);
        int length =MainWord.length();
        for (int i=length-1;i>=0;i--){
            reverse=reverse+MainWord.charAt(i);}
            System.out.println("palidrom :"+reverse);
            if (MainWord.equals(reverse)){
                System.out.println("Palidrom is valid");
            }else {
                System.out.println("palidrom is not valid");
            }
    }
    public void Int(){
        int num=121;
    }

    public static void main(String args[])
    {
        StringsPalidrom p=new StringsPalidrom();
        p.Palidrom();


    }
}