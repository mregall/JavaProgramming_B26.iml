package day26_nested_loops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        /*
        Count how many times each letter is in the String

         */
        System.out.println("enter your word or phrase:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String lettersAlreadyChecked = ""; //this is one of the placeholder variables.  It takes note of the letters you've counted already.  It's stored outside the loops

//Outer Loop
        for (int thisPosition = 0; thisPosition < word.length(); thisPosition++) { //Position within the word.

            char letterAtThisPosition = word.charAt(thisPosition); //this is the actual a b or c at each position
            int count = 0; //each time we find a matching letter

            if(lettersAlreadyChecked.contains("" + letterAtThisPosition)){ //this is eliminating duplicate searches
                continue; //continue means skip the rest of this iteration if it is a duplicate
            }
//Inner Loop
            for (int otherPositions = 0; otherPositions < word.length(); otherPositions++) { //inner loop cross checks
                char letterAtOtherPosition = word.charAt(otherPositions);
                //imagine you're holding your index letter and walking past all the other letters looking for a match

                if (letterAtThisPosition == letterAtOtherPosition){ // also could be word.charAt(i) == word.charAt(j);
                    count++;
            }


        }//end of inner loop
            System.out.println(letterAtThisPosition + " - " + count);
            lettersAlreadyChecked += letterAtThisPosition;


    }//end of outer loop

}}
