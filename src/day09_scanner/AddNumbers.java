package day09_scanner;

import java.util.Scanner;

public class AddNumbers {
    /*
        create Scanner object
        ask the user to enter 3 numbers
        find and print the sum of the numbers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Max Price: ");

        double max = input.nextDouble();
        System.out.println("Enter Current Price: ");
        double current = input.nextDouble();
        double percent = ((max-current)/max);


        System.out.println("The percent from the high is: " + String.format("%.2f", percent));

    }
}
