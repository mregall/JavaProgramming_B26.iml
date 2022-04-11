package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Lowercase {
    /*
    Create an ArrayList of Characters
        Fill the ArrayList with letters from a-z
        Print the ArrayList of all the characters
        Manually remove each vowels and print the new ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> lower = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","i","k","m","o","p","u","v"));
        System.out.println(lower);
        lower.remove("a");
        lower.remove("e");
        lower.remove("i");
        lower.remove("o");
        lower.remove("u");
        System.out.println(lower);

        }

    }

