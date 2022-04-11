package arraylist_practice;

import java.util.ArrayList;

public class Flow1 {
    /*
    Create an ArrayList of Strings
        add these elements:
        add Hat
        add Shoes
        add Jacket in middle of Hat and Shoes
        add Towel in the beginning
        add Car between Towel and Hat
        Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("Hat");
        System.out.println(stuff);
        stuff.add("Shoes");
        stuff.add(1, "Jacket");
        System.out.println(stuff);
        stuff.add(0, "Towel");
        stuff.add(1, "Car");
        System.out.println(stuff);
    }
}
