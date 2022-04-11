package additional_practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Reverse Array
        Write a program that will reverse the order of any given array
        Ex:
        Input:
        [1, 2, 3, 4, 5]
        Output:
        [5, 4, 3, 2, 1]
         */
        int [] whateverArray = {10, 20, 30, 40, 50};
        int [] reverse = new int[whateverArray.length];

        for (int i = whateverArray.length-1, j = 0; i >= 0; i--, j++) {
            // good stuff.  The loop counts the variables in different directions
            // the loop IS NOT the variables.  The loop is in terms of one variable, another variable can tag along.

            reverse[j] = whateverArray[i];

        }
        System.out.println(Arrays.toString(reverse));


    }
}
