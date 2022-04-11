package additional_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
/*
100 number array
1. Create an int array called numbers that has length of 100
2. Assign 1-100 to each index of the array. Then print your number
array
 */
public class NumberArray100 {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        int count = 1;

        for (int i = 0; i < 100; i++) {
            numbers[i] = count;
            count++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
