package day24_for_loops2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

            /*
            Given a sentence determine how many words are in the String.
            Ex:
            Input: This has multiple words
            Output: 4

             */
                Scanner input = new Scanner(System.in);
                String word = input.nextLine().trim();
                int i = 0, spaceCount = 1;

                while( i < word.length() ){
                    if( word.charAt(i) == ' ' ) {
                        spaceCount++;
                    }
                    i++;
                }

                System.out.println("Words in string: "+spaceCount);

            }
        }




