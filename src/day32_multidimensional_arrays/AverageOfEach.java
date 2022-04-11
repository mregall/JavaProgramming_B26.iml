package day32_multidimensional_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        /*
        We're given a 2d array. Dynamic.
        Find and print the average of each inner array and the average of the averages
        3, 4, 5, 6
        5, 2, 6
        10, 20, 30
         */

        int[][] numbs = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 39}
        };

        //todo the sum of all the numbers we need two variables outside of the entire array
        double total = 0;
        int totalLength = 0;

        for (int[] eachArray : numbs) {
            //System.out.println(Arrays.toString(eachArray));
            double sum = 0;
            for (int data : eachArray) {
                //System.out.println(data);
                sum += data;

            }
            System.out.println(Arrays.toString(eachArray) + " The sum of the array is " + sum + "\nand the average is " + (sum / eachArray.length) + "\n");
            total += sum;
            totalLength += eachArray.length;
        }
        System.out.println("The average off all the data is " + (total/totalLength));


    }
}
