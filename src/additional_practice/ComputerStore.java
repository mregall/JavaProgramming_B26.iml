package additional_practice;
import java.util.Scanner;
public class ComputerStore {
    public static void main(String[] args) {

        System.out.println("Welcome to iCydeo, your crazy computer warehouse.\nChose from options below to build your dream computer.");
        System.out.println("Please choose from the following screen sizes.\n\t13.3\n\t15.0\n\t17.3\nEnter your selection:");

        Scanner scan=new Scanner (System.in);
        String screenSize = scan.next();

        String message = "";
        int runningTotal = 0;


        switch(screenSize){

            case "13.3":
                runningTotal += 200;
                message = "You chose 13.3, your running total is: $" + runningTotal;
                break;
            case "15.0":
                runningTotal += 300;
                message = "You chose 15.0, your running total is: $" + runningTotal;
                break;
            case "17.3":
                runningTotal += 400;
                message = "You chose 17.3, your running total is: $" + runningTotal;
                break;
            default:
                message = "Invalid Selection";

    }
        System.out.println(message);

        System.out.println("Please choose from the following CPU types.\n\ti3\n\ti5\n\ti7\nEnter your selection:");
        String CPU = scan.next();

        switch (CPU) {
            case "i3":
                runningTotal += 150;
                message = "You chose i3, your running total is: $" + runningTotal;
                break;
            case "i5":
                runningTotal += 250;
                message = "You chose i5, your running total is: $" + runningTotal;
                break;
            case "i7":
                runningTotal += 350;
                message = "You chose i7, your running total is: $" + runningTotal;
                break;
            default:
                message = "Invalid Selection";
        }
        System.out.println(message);

        System.out.println("RAM is $50 for each 4gb.  Enter an increment of 4gb");
        int RAM = scan.nextInt();
            runningTotal = runningTotal + (RAM * 50);
            message = "You chose " + (RAM*4) + " gb of RAM.  Your running total is: $" + runningTotal;

        System.out.println(message);

        System.out.println("Please choose from either HDD or SSD storage");
        String storage = scan.next();



        switch (storage) {
            case "HHD":
            case "hhd":
                System.out.println("You chose HDD, each 500gb of HDD is $50.  Enter a how many 500gb you want:");
                int quantityHDD = scan.nextInt();
                runningTotal += quantityHDD * 50;
                message = "You chose " + (quantityHDD * 500) + " gb of storage.  Your running total is: $" + runningTotal;
                break;

            case "SSD":
            case "ssd":
                System.out.println("You chose SSD, each 500gb of SSD is $100.  Enter a how many 500gb you want:");
                int quantitySSD = scan.nextInt();
                runningTotal += quantitySSD * 100;
                message = "You chose " + (quantitySSD * 500) + " gb of storage.  Your running total is: $" + runningTotal;
                break;

            default:
                message = "Invalid Selection";

           /* if(resolution == "HHD" || resolution == "hhd") {

                message = "You chose HDD, each 500gb of HDD is $50.  Enter a how many 500gb you want:";
                int quantityHDD = scan.nextInt();
                runningTotal = runningTotal + (quantityHDD * 50);

            } else if (resolution == "SSD" || resolution == "ssd") {

                message = "You chose SSD, each 500gb of SSD is $100.  Enter a how many 500gb you want:";
                int quantitySSD = scan.nextInt();
                runningTotal = runningTotal + (quantitySSD * 100);

            } else {
                message = "Invalid Selection";
        }*/
        }
        System.out.println(message);

        System.out.println("Finally lets choose your screen resolution.\n\t(1) FullHD\n\t(2) 4k\nPress 1 or 2 to make your selection");
        int resolution = scan.nextInt();

        switch(resolution){
            case 1:
                runningTotal += 100;
                message = "Thank you for choosing FULLHD.";
                break;

            case 2:
                runningTotal += 200;
                message = "Thank you for choosing 4K.";
                break;

            default:
                message = "Invalid Selection";
        }
        System.out.println(message);
        System.out.println("Final price is: $" + runningTotal);



}}
