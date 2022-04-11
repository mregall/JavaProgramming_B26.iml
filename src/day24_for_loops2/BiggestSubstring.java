package day24_for_loops2;

import java.util.Scanner;

public class BiggestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         /*
    Biggest substring of matching characters
        Given a String find the biggest substring of chars that match and print it.
        Ex: aaabbbcccccddddee Output: ccccc
     */

        String s = "aaabbbccccdddeee";
        String sub = "";
        String biggest = "";

        for (int i = 0; i < s.length()-1; i++) {
            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i +1)){ //when we switch to the next char
                if (sub.length() > biggest.length()){
                    biggest = sub;
                }
                sub = "";// resets the sub to empty
            }
        }
        System.out.println(biggest);
    }
}
