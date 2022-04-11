package day25_loop_recap;

import java.util.Scanner;

 /*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
     */

public class ReverseMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words");
        String str = input.nextLine().trim();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middleWord = str.substring(firstSpace +1, lastSpace);
        String reverse = "";

        for (int i = middleWord.length()-1; i >= 0; i--) {
            reverse += middleWord.charAt(i);

        }
        System.out.println(str.substring(0, str.indexOf(" ")) + " " + reverse +  str.substring(str.lastIndexOf(" ")));

    }
}
