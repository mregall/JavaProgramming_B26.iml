package day15_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my Japanese Vending Machine.\nPlease select one of the following\n\tDrinks\n\tSnacks\n\tGum\n\nMake Selection Here:");
        String selection = input.next();
        String item = "";

        switch (selection){

            case "Drinks":
                System.out.println("You chose drinks: pres a number: \n\t1) Water\n\t2) Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if(drinkNumber == 1) {
                    item = "water";
                }else if(drinkNumber == 2) {
                    item = "soda";
                }else if(drinkNumber == 3) {
                    item = "juice";
                }

                break;

            case "Snacks":
                System.out.println("You chose Snacks: pres a number: \n\t4) Chips\n\t5) Cookies");
                int snackNumber = input.nextInt();

                if(snackNumber == 4) {
                    item = "Chips";
                }else if(snackNumber == 5) {
                    item = "Cookies";
                }

            case "Gum":
                item = "Juicy Fruit Gum";


            default:            //default is not mandatory, just an option


        } //end switch
        System.out.println("Vending....... " + item);
    }

}
