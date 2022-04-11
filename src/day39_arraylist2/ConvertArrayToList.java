package day39_arraylist2;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3};
        //use an Integer array because ArrayList doesn't accept primitive.

        Arrays.asList(arr); //converts to a collection type.

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        // ArrayList with values from a collection type.
        System.out.println(nums);

        System.out.println("=============================================");

        //Creating an ArrayList with some initial values.

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList());

        Arrays.asList(4, 5, 6, 7);
        System.out.println(other);

        /*
           Arrays.asList(4, 5, 6, 7)
            [4, 5, 6, 7] --> converts to ArrayList [ 4, 5, 6, 7]

         */
    }
}
