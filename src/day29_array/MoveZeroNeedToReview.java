package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroNeedToReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that will move all the zero numbers to the end of the array.
        The rest of the numbers will move over in position
        Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
        Input: [10, 0, 5, 0, 1, 0]    Output: [10, 5, 1, 0, 0, 0]
         */
        int[] numbs = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[numbs.length];
        int index = 0; //starting at element zero in the new fixed array

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] != 0){
                fixed[index++] = numbs[i];
                //index is just giving the element number in the array since it only goes up if there's a non-zero number
                //reading the element at position i of the nums array and storing it into the fixed array and position index. after storing the value index variable is incremented by 1
            }
        }

        System.out.println(Arrays.toString(fixed));

            }
        }

