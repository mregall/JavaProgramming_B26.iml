package day33_methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Age {
    /*
    Make a method that calculates and prints someone's age based on year.
     */

    public static void FindsAge(int birthYear){
        //don't use scanner inside a method.
        System.out.println("Your Age is: " + (2022-birthYear));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear = input.nextInt();
        FindsAge(birthYear);

        /*
        Could also do:
        Scanner input = new Scanner(System.in);
        FindsAge(input.nextInt());
         */
    }
}
