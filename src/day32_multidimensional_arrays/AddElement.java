package day32_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        /*

    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

     */

        int [] a = { 1, 2, 3 };
        int [] b = a; // b is a new reference/name but the array is the same as the one 'a' reference/name is pointing to, so there is only one array made
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int [] z = Arrays.copyOf(a, a.length*2);
        System.out.println(Arrays.toString(z));

        z[0] = 500;

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("z: " + Arrays.toString(z));

         /*

    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 124, 62, 100}

     */



            Scanner input = new Scanner(System.in);
            // Ask how many numbers to start with
            System.out.println("How many numbers do you want to start with");
            int size = input.nextInt();
            int [] nums = new int[size];

            for(int i = 0; i < nums.length; i++){ // the purpose of this loop is to get all the numbers for the array

                System.out.println("Enter a number");
                nums[i]= input.nextInt();
            }

            System.out.println("Array so far: " + Arrays.toString(nums));
            int [] expanded = Arrays.copyOf(nums, nums.length + 1);

            System.out.println("Enter the last number");
            expanded[expanded.length - 1] = input.nextInt();
            System.out.println(Arrays.toString(expanded));
            System.out.println();
    }
}
