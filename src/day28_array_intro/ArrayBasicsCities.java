package day28_array_intro;

import java.util.Arrays;

public class ArrayBasicsCities {
    public static void main(String[] args) {
        //normal list of variables

        String cityOne = "Chicago";
        String cityTwo = "NYC";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        //declare array with values

        String [] cities = {"Chicago" , "New York", "Houston", "Denver", "Pittsburgh"};
        //items are called elements in an array.
        //separate with commas outside the quotes (orange commas)

        System.out.println(cities);
        //this prints out a hash location

        String [] cities2 = {cityOne, cityTwo, cityThree, cityFour, cityFive};
        //the elements can be variables

        System.out.println(cities[0]);
        //print a single element

        System.out.println(cities[0] + ", " + cities[1]);
        //printing multiple elements with concat.
        System.out.println(cities[3] + "\n" + cities[1]);
        //different lines, different order
        System.out.println(Arrays.toString(cities));
        //how to print all the values

        System.out.println("---------------------------");

        //How to make an array another way.

        int [] intArray = new int[5];
        //array of ints with five elements

        System.out.println(Arrays.toString(intArray));

        /*
        Default values for array types
        String == null
        int == 0
        double == 0.0
        boolean == false

        What is the difference between "null" and "empty space"
        null == nothing for objects
        empty space == a String with no char
         */



    }
}
