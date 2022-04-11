package additional_practice;
import java.util.Scanner;
public class VehicleRecall {
    public static void main(String[] args) {
        /*
        1995-1998,
        2001-2002,
        2004-2006,
        2015-2017
         */

        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE BELOW:

        if (vehicleYear >= 1995 && vehicleYear <= 1998)
            System.out.println("Your vehicle needs to be recalled!");
        else if (vehicleYear >= 2001 && vehicleYear <= 2002)
            System.out.println("Your vehicle needs to be recalled!");
        else if (vehicleYear >= 2004 && vehicleYear <= 2006)
            System.out.println("Your vehicle needs to be recalled!");
        else if (vehicleYear >= 2015 && vehicleYear <= 2017)
            System.out.println("Your vehicle needs to be recalled!");
        else System.out.println("Your vehicle is fine, enjoy!");


    }
}