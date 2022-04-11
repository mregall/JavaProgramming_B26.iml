package day35_methods_and_util;

public class ContainsArray {
    /*
        Contains

    create a method that will accept an int array and an int number. Check and return if the given number is in the array.
         */
    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {

            if (each == element) {
                return true;
            }
        }
        return false;
    }
}
