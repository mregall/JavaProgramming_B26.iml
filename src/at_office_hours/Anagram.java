package at_office_hours;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Task 04 : Anagram

                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method
         */
        System.out.println("Type word or phrase 1:");
        String first = input.nextLine().toLowerCase().trim();
        first = first.replace(" ", "");
        //Eliminates any spaces between the words, because we're getting down to just the letters.  That's all that matters for anagram

        System.out.println("Type your second phrase:");
        String second = input.nextLine().toLowerCase().trim();
        second = second.replace(" ", "");

        if (first.length() != second.length()){
            System.out.println("Not an Anagram");
        } else {
            for (int i = 0; i < first.length(); i++) {
                char eachLetter = first.charAt(i);
                second = second.replaceFirst(eachLetter + "", "");
                //what we're going to do is empty out the second phrase by deleting all matching letters.  If at the end there are no letters left, its an anagram.
                //replacefirst here because we only want to go one letter at a time.

            }
            if (second.isEmpty()){
                System.out.println("They are an Anagram");
            }else {
                System.out.println("Not an Anagram");
            }


        }

    }
}
