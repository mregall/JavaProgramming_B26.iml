package day42_custom_classes;

import java.util.Arrays;

public class UsingCoffee {
    public static void main(String[] bananaSandwiches) {



        Coffee coffee1 = new Coffee();
        coffee1.brand = "Starbucks";
        coffee1.price = 8.99;
        coffee1.size = 12;
        coffee1.type = "Americano";
        System.out.println(coffee1);
        coffee1.drink();
        coffee1.refill(8);
        System.out.println(coffee1);

        System.out.println(Arrays.toString(bananaSandwiches));

    }
}
