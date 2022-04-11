package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Uppercase {
    /*
    Create an ArrayList of Characters
        Fill the ArrayList with letters from A-Z
        Print the ArrayList of all the characters
     */
    public static void main(String[] args) {
        ArrayList<Character> upper = new ArrayList<>(Arrays.asList('A','B','C','D','E','F'));
        System.out.println(upper);
    }
}
