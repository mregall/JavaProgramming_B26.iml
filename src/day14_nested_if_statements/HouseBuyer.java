package day14_nested_if_statements;
import java.util.Scanner;
public class HouseBuyer {
    public static void main(String[] args) {
         /*

        We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the information of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 75,000
            rating - 3.5
            gated - no
            allow pets - yes

            name - Highland
            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 -201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is not in any range print: "No available houses"

     */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your budget?");
        int budget = input.nextInt();

        String name, priceRange;
        double rating;
        boolean gated, pets;

        if(budget <= 0) {
            System.out.println("Invalid");
        } else {
            if(budget >= 55000 && budget <= 75000) {
               name = "Oaks";
               priceRange = "55,000 - 75,000";
               rating = 3.5;
               gated = false;
               pets = true;

            } else if(budget >= 80000 && budget <=100000) {
                System.out.println("Hills");
            } else if(budget >= 120000 && budget <=150000) {
                System.out.println("Highland");
            } else if(budget >= 160000 && budget <=201000) {
                System.out.println("Canyon");
            } else {
                System.out.println("None available");

        }




    }
}}
