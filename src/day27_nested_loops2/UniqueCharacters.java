package day27_nested_loops2;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "AABCCDEEF";
        //System.out.println("i loop - j loop");

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
                //System.out.println("   " + letter + "   -   " + inner);

                if (letter == inner) {
                    count++;
                }


            }//inner loop

            if (count == 1) {
                System.out.println(letter);
            }

        }//outer loop
}}
