package DataStractur;

import java.util.*;
class Strings
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner word= new Scanner(System.in);

        System.out.println("Enter a string ");
        original = word.nextLine();
        System.out.println(" Oroginal String :"+original);

        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
    }
}