package day25_loop_recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Input:
        Today is SUNDAY

        Output:
        todayIsSunday

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();
        String camelCase = str.substring(0, 1);
        //skipping the first word because it's not to be capitalized in the output

        for(int i = 1; i < str.length(); i++){

            if(str.charAt(i - 1) == ' '){
                camelCase += str.substring(i , i + 1).toUpperCase();
                //capitalizing the first letter after each space in the string

            } else {
                camelCase += str.charAt(i);
                //otherwise, just adding to the new string as is
            }

        }

        System.out.println(camelCase.replace(" ", ""));
        // delete the spaces in a separate logical step not related to the loop or if statement

        // here we're learning two separate steps of logic one in and one out of the loop.
        // in essence concatenating the things we've learned so far
    }
}
