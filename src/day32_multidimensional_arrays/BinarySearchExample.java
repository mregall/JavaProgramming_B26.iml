package day32_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        /*
        Arrays.binarySearch()
		find/search for the position of an element in the array

		--> in order for the method to work, the array must be sorted

		two arguments:

			(array, element)

				array: the sorted array you are checking in
				element: the element you are trying to find the index/position of

		if the element you are looking for is not in the array, then it returns a negative number based on where the position would be + 1

         */

        int [] nums = { 4, 10, 30, 100};

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200)); // would be in position 4, so 4 + 1 = 5 and negative because it was not in the array so -5
        System.out.println(Arrays.binarySearch(nums, 6)); // would be in position 1, so 1 + 1 = 2 and negative because it was not in the array, so -2


    }
}
