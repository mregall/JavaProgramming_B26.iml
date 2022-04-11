package day10_scanner2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our Leap Year Verification Service\nPlease enter a year: ");
        int year = scan.nextInt();

        boolean leapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0 );


        System.out.println("\nThe year you entered is a leap year: " + leapYear);


    }
}
