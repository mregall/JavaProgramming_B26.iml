package day10_scanner2;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your Salary? ");
        double salary = input.nextDouble();
        System.out.println("How many hours did you work in a week? ");
        int hoursInWeek = input.nextInt();

        double hourlyRate = salary / (hoursInWeek * 52);
        double roundOff = Math.round(hourlyRate * 100.0) / 100.0;

        System.out.println("With a salary of " + salary + " and working for " + hoursInWeek + " hours, your hourly rate is $" + roundOff);

/*
        double roundOff = Math.round(hourlyRate * 100.0) / 100.0;

        System.out.println("The price after tax is $" + roundOff);

 */




    }
}
