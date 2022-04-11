package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {

       String houseType = "Penthouse"; // Variable Declaration
       int numberOfBedrooms = 4; // Assignment Statement 
       int numberOfBathrooms = 3;
       int numberOfKitchens = 1;
       boolean isThereBasement = true;
       boolean isThereAttic = false;
       boolean isTherePool = true;
       boolean forSale = false;
       double costOfHouse = 750_000.01; //cost related items are typically double variables
        String address = "W123N1234 Penthouse Ct";
        int zipCode = 53089;
        boolean parkNearBy = true;
        double schoolRating = 4.5;

        String houseinfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen.\nIt also includes a basement: " + isThereBasement + ", has an attic: " + isThereAttic + ", has a pool: " + isTherePool + ", and is on sale: " + forSale + ",\n and has a park near by: " + parkNearBy + ". The schools in the area have a rating of " + schoolRating;

        System.out.println(houseinfo);








    }
}
