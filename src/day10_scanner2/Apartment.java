package day10_scanner2;
import java.util.Scanner;
public class Apartment {
    public static void main(String[] args) {
         /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */
        String address, nameOfOwner, lengthLease, phoneNumber;
        int numUnits, unitSize, numWashDry, residents, numFloors, numParking;
        double numstars, monthlyRent;
        boolean pets, pool, gasStation, basement, available, airConditioning, wheelchair;


        Scanner input = new Scanner(System.in);

        System.out.println("What is the address? ");
        address = input.nextLine();

        System.out.println("What is the owner's name? ");
        nameOfOwner = input.nextLine();

        System.out.println("What is the owner's phone number? ");
        phoneNumber = input.nextLine();

        System.out.println("How many units in the building? ");
        numUnits = input.nextInt();

        System.out.println("What is the average size of a unit? ");
        unitSize = input.nextInt();

        System.out.println("What is the monthly rent? ");
        monthlyRent = input.nextDouble();

        System.out.println("How many washers and dryers in the building? ");
        numWashDry = input.nextInt();

        System.out.println("How many residents are in the building? ");
        residents = input.nextInt();

        System.out.println("How many floors are in the building? ");
        numFloors = input.nextInt();

        System.out.println("How many parking spaces are on the property? ");
        numParking = input.nextInt();

        System.out.println("How many stars review does the building have? ");
        numstars = input.nextDouble();

        System.out.println("Pets allowed? (true or false)");
        pets = input.nextBoolean();

        System.out.println("Is there a pool? (true or false) ");
        pool = input.nextBoolean();

        System.out.println("Is the building near a gas station? (true or false) ");
        gasStation = input.nextBoolean();

        System.out.println("Is there a basement? (true or false) ");
        basement = input.nextBoolean();

        System.out.println("Is a unit available? (true or false) ");
        available = input.nextBoolean();

        System.out.println("Is there air conditioning? (true or false) ");
        airConditioning = input.nextBoolean();

        System.out.println("Is there wheelchair access? (true or false) ");
        wheelchair = input.nextBoolean();

        double rentThree, rentSix, avgResidents, avgParking, avgUnits;

        rentThree = monthlyRent * .9;
        rentSix = monthlyRent * .8;
        avgResidents = residents / numUnits;
        avgParking = numParking / numUnits;
        avgUnits = numUnits / numFloors;


        System.out.println("Your new apartment at " + address + " is owned by " + nameOfOwner + ". The building has " + numUnits + " units. After six years rent is "+ rentSix + " after three years "+ rentThree + " Each floor has "+ avgUnits + " units. There are this many parking spaces per unit "+ avgParking + " Each floor has an average of this many units "+ avgUnits);





    }
}
