package day23_for_loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //palindrome is the same forwards and back
        //mom, racecar, anna, madam

        String x, y = "";
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string you want to check:");
        x = a.nextLine();
        int len = x.length();
        for(int i = len - 1; i >= 0; i--)
        {
            y = y + x.charAt(i);
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System. out.println("The string is not a palindrome.");
        }
/*
        String str = "abcde";

        // reverse the String

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){

           reverse += str.charAt(i); // characters are being red from the end and being added backward into a reverse String

        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");
 */

    }
}
