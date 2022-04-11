package day09_scanner;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        /* create a scanner.  ask the user for two numbers.  check if they are equal

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("Please enter another number");
        int number2 = input.nextInt();
        System.out.println(number == number2);



    }
}
