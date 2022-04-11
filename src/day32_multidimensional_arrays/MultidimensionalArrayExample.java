package day32_multidimensional_arrays;

import java.util.Arrays;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {

        /*
        Multidimensional Arrays

	Array inside of an array. The elements of a 2D array is a single dimensional array

	single dimensional array:

		int [] a = {1, 2, 3};

	2D array:

		int [][] arr = {

			{1, 2, 3},
			{4, 5, 6}

		}

		arr[0] --> {1, 2, 3}
		arr[1] --> {4, 5, 6}

		How to access the first element of each inner array

			arr[0][0] --> 1
			arr[1][0] --> 4

	How to print multi dimensional arrays

		Arrays.deepToString()

	int [][][]
		3D array --> elements are 2D --> 1D array

         */

        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};

        int[][] all = {n, m};
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: " + Arrays.toString(all[0]));
        System.out.println("Second array: " + Arrays.toString(all[1]));

        System.out.println();
        int[][] multi = {
                {90, 80, 70},  // index 0 array
                {19, 51, 1129, 12}, // index 1 array
                {10, 1900}, // index 2 array
                {14}       // index 3 array
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(multi[3].length);
        System.out.println(multi[3][1]);

    }
}
