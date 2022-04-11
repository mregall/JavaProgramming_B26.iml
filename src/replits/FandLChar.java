package replits;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a String [] words print the first and last character of each String element in the array. Print the first and last character in the same line with no spaces.

 */

public class FandLChar {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



    //WRITE YOUR CODE BELOW:
    for(String each : words){
        String letters = "";
        //letters += "" + each.charAt(0) + each.charAt(each.length()-1);
        System.out.println("" + each.charAt(0) + each.charAt(each.length()-1));

    }

}}
