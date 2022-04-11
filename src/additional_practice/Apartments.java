package additional_practice;
import java.util.Scanner;
public class Apartments {
    public static void main(String[] args) {
        /*
1 bedroom: 1100
2 bedroom: 1850
3 bedroom: 2550

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        if (numberOfBedrooms == 1)
            System.out.println("One Bedroom Selected\n" +
                    "Starting Price: 1100");
        if (numberOfBedrooms == 2)
            System.out.println("Two Bedroom Selected\n" +
                    "Starting Price: 1850");
        if (numberOfBedrooms == 3)
            System.out.println("Three Bedroom Selected\n" +
                    "Starting Price: 2550");
        else if (numberOfBedrooms > 3 || numberOfBedrooms < 1)
            System.out.println("Sorry, we do not offer that many bedrooms");



        int x = 10;
        int y = x++;
        System.out.println(y++ + " " + x++ + " " +y);

        if(x==3)
            System.out.println(x + "3");

    }
}
