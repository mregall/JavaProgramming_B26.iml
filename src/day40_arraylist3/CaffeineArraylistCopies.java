package day40_arraylist3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaffeineArraylistCopies {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drinks");
        drinks.add("soda");

        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        System.out.println(drinks2);

        String[] allDrinks = {"coffee", "tea", "energy drink", "soda"};
        //We can't just make an array into an array list with assignment.  We have to use .asList()

        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drink", "soda"));

        ArrayList<String> drinks5 = (ArrayList<String>)drinks.clone(); // the book said to cast a clone? IJ no likey.





    }
}
