package day19_string3;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentance");
        String str = input.nextLine();

        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(str.length()-1));

        String word = "    Winter is coming  ";
        word = word.trim();
        System.out.println(word.length());




    }
}
