package day20_string4;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        /*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language Output: is a fun language Java
        Hint: Use indexOf and substring
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Type a sentence");
        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(' ');

        String firstWord = sentence.substring(0, spaceIndex);

        String result = sentence.substring(spaceIndex) + " " + firstWord;



        System.out.println(result);



    }
}
