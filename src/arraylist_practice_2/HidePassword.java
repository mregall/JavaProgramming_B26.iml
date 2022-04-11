package arraylist_practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Hide Password
        Given an ArrayList of passwords (String). Hide each password in a star
        (*) format where each character is a star and print the ArrayList of
        hidden passwords
        Ex:
        Input:
        {"one", "hi", "hold}
        Output:
        [ ***, **, **** ]
     */
    public static void main(String[] args) {
        ArrayList<String> pass = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> stars = new ArrayList<>();
        String hide = "";

        for (String each : pass) {
            hide = ""; //reset hide each time you move to a new element
            for (int i = 0; i < each.length(); i++) {
              hide += "*";  //make the string to go through the chars, then put the string into the new array after each element.
            }
            stars.add(hide);
        }
        System.out.println(stars);
    }
}