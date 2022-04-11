package day10_scanner2;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //name an input variable called: scan

        System.out.println("Enter the price of the item:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity of the item:");
        int quantity = scan.nextInt();

        double revenue = price * quantity;

        System.out.println("The revenue is: $" + revenue);

        double taxRate = 1.05;
        double finalPrice = revenue * taxRate;
        double roundOff = Math.round(finalPrice * 100.0) / 100.0;

        System.out.println("The price after tax is $" + roundOff);









    }
}
