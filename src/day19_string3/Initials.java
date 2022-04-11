package day19_string3;
import java.util.Locale;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
         /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next().toUpperCase();

        System.out.println("Enter your Last name:");
        String lastName = input.next().toUpperCase();

        System.out.println("" + firstName.charAt(0) + lastName.charAt(0));
        //the "" lets it know that this is a string and not a math problem.

        /*
        You can also change it to String firstName = input.next()
        char firstLetter = firstName.charAt(0);
        ...
        sout("" + firstLetter + secondLetter);

        This would only affect the first character with the .toUpperCase.  Later that will matter.

         */


    }
}
