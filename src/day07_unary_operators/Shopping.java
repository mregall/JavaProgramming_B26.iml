package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("Grab a water.");
        System.out.println("Items in the cart: " + ++numberOfItems);
        price = price + 2.5;

        System.out.println("And scoop two 40s.");
        ++numberOfItems;
        ++numberOfItems;

        System.out.println("Items in the cart: " + numberOfItems);
        price = price + (5*2);

        System.out.println("The price is now: $" + price);










    }
}
