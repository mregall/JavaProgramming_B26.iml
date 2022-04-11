package day37_wrapper_classes;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2022";

        System.out.println("year = " + year);
        System.out.println("Next year will be " + (year + 1));//doesn't work 20221

        int numYear = Integer.parseInt(year);  // returns an int

        System.out.println("numYear = " + numYear);
        System.out.println("Next year will be " + (numYear + 1)); //haha it works

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        String str = input.nextLine();//Expected: I am x years old
        //in five years you'll be $ageIn5Years.

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " + (age + 5) + " years old.");
    }
}
