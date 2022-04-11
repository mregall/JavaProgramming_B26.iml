package day05_variables2;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "iPhone 10";
        String color = "Space Grey";
        double price = 1299;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in the color " + color + " and it has " + storage + " GB.");
        System.out.println("For the SIM type " +sim+ " with a camera " +hasCamera+ " the total price was $" +price+ ".");
//  String fullMessage = "\nI have an " + model + " from "+ brand + "\nIt came in the color " + color + " and it has " + storage + "GB \nFor the sim type" + sim + " with a camera" + hasCamera + " the total price was $" + price;


    }
}
