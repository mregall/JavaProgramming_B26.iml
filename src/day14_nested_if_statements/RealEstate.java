package day14_nested_if_statements;
import java.util.Scanner;
public class RealEstate {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("What is your budget?");
    int budget = input.nextInt();


    String name = "", range ="";
    double rating = 0;
    boolean gated = false, allowPets = false;

        if (budget > 0 && budget < 300_000) {

        System.out.println("Lets see if there are any houses");

        if (budget >= 55_000 && budget <= 75_000) {
            name = "Oaks";
            range = "55,000 - 75,000";
            rating = 3.5;
            gated = false;
            allowPets = true;
        } else if (budget >= 80_000 && budget <= 100_000) {
            name = "Hills";
            range = "80,000 - 100,000";
            rating = 4.0;
            gated = false;
            allowPets = true;
        } else if (budget >= 120_000 && budget <= 150_000) {
            name = "Highland";
            range = "120,000 - 150,000";
            rating = 4.5;
            gated = true;
            allowPets = false;
        } else if (budget >= 160_000 && budget <= 201_000) {
            name = "Canyon";
            range = "160,000 - 201,000";
            rating = 4.8;
            gated = true;
            allowPets = true;
        } else {
            System.out.println("No available houses");
        }

        String ad = "Name of the neighborhood: " + name + "\nPrice Range: " + range + "\nRating: " + rating;
        ad += gated ? "\nThe house is gated" : "The house is not gated"; //Ternary: This means is it gated? If true, then "yes", if false, then "no"
        ad += "\nThey allow Pets: " + (allowPets ? "Yes" : "No");

        System.out.println(ad);

    } else {

        if (budget <= 0) {
            System.out.println("Your budget cannot be less than or equal to 0");
        } else {
            System.out.println("Too much money for this agency");
        }

    }

}}
