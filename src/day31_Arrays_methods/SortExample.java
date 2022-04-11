package day31_Arrays_methods;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int [] nums = {4,6,34,6798,3,22,1,-4};
        int [] notSorted = nums; //--> you can't just do this to copy the array, it just makes a second name for the same thing.
        Arrays.sort(nums);
        System.out.println("nums: " + Arrays.toString(notSorted));

        System.out.println("=============================================");

        String [] arr = {"java", "Hello", " hi", "$Dollar", "4oneFour", "five", "zebra", "Five"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
