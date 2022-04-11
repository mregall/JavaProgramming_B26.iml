package day20_string4;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase();
        fixedFirst += firstName.substring(1);

        String fixedLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(fixedFirst);
        System.out.println(fixedLast);

        System.out.println(fixedFirst + " " + fixedLast);


    }
}
