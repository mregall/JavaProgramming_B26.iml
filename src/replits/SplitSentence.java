package replits;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:

        String [] words = sentence.split(" ");

        for (String each : words){
            System.out.println(each);
        }


    }
}
