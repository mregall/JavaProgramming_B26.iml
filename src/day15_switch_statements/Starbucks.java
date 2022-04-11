package day15_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
         /*

    Declare price and calories variables

    Ask the user to enter which size drink they want

    Based on the drink size determine the price and calories of the order

        data:

            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200

     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size drink");
        String size = input.next();
        int calories = 0;
        double price = 0;
        // to make a catchall for invalid orders, we can add a boolean that's called validOrder.  That way we can have a step when they enter the wrong information.
        boolean validOrder = true;

        switch(size){

            case "tall":
                price = 2.5;
                calories = 100;
                break;

            case "grande":
                price = 4.0;
                calories = 150;
                break;

            case "venti":
                price = 4.50;
                calories = 200;
                break;

            default:
                System.out.println("We don't have that size Mr Snoop D to the double G");
                validOrder = false; // this line adds a caveat so it prints the message, but NOT the print line below with the order summary.

        }

        if(validOrder)
        System.out.println("Your order for a " + size + " coffeee is $" + price + " and has " + calories + " calories.");



    }
}
