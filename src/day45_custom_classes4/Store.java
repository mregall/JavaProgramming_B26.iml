package day45_custom_classes4;

import java.util.Arrays;

public class Store {
     /*
        Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
     */

    public static void main(String[] args) {

        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays", 2, 1.99);
        System.out.println(chips);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.totalPrice();
        System.out.println(apples);

        System.out.println(apples.totalPrice);

        System.out.println("==========================");

        String [] strs = {"one", "two", "three"}; // not doing anything with this array, just a reference to see we have worked with object types with arrays

        Food [] allFood = {apples, chips, chicken, null}; // = new Food[4]
        System.out.println(allFood[2]);

        System.out.println("-------------------------");

        allFood[3] = new Food("Fish", 4, 3.50); // making a new Food object assigning it into the array in index 3

        System.out.println(Arrays.toString(allFood)); // print all the whole array of Food objects

        // calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;

        for(Food each : allFood){ // each == allFood[i]  // why is Food the first thing in the for each - it is the datatype of each element
            //notice the for each loop isn't using String or prim type, it's the object in the array that it's going through
            System.out.println(each); // extra line just to see each Food object, each iteration
            totalPriceAll += each.totalPrice; // takes the Food object's total price instance variable value
        }
        System.out.println(totalPriceAll);


    }
}