package additional_practice;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        /*
        Average Number from Array
        Given an int array calculate the average number
        -> Make it flexible so it will work with any array size
        Examples:
        [1,2,3] -> average: 2
        [10, 15, 5, 6] -> average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers in your array?");
        int size = input.nextInt();
        int [] arrayLength = new int[size];
        double num = 0;


        for (int i = 0; i < arrayLength.length; i++) {
            System.out.println("Enter an array value:");
            arrayLength[i] = input.nextInt();
            num += arrayLength[i];

        }
        System.out.println("Average: " + num / arrayLength.length);
    }
}
