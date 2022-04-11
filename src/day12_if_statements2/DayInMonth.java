package day12_if_statements2;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number for a month 1-12");
        int month   = input.nextInt();

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        boolean has28Days = month == 2;

        if(has31Days) {
            System.out.println("31 days");
        }

        if(has30Days) {
            System.out.println("30 days");
        }

        if(has28Days) {
            System.out.println("28 days");
        }

    }
}
