package arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Flow2 {
    /*
    Create an ArrayList of Strings
        add these elements:
        Iron Man, Spider Man, Thor, Captain America, Hawkeye
        remove Thor by index
        remove Iron Man by element
        remove the first index
        Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> heros = new ArrayList<>(Arrays.asList("Iron Man", "Spider Man", "Thor", "Captain America", "Hawkeye"));
        System.out.println(heros);
        heros.remove(2);
        System.out.println(heros);
        heros.remove("Iron Man");
        System.out.println(heros);
        heros.remove(0);
        System.out.println(heros);



    }
}
