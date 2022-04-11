package day10_scanner2;
import java.util.Scanner;
public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day is today?:");
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Today: "+ day);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);


    }
}
