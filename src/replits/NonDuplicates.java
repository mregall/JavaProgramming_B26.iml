package replits;

import java.util.Scanner;

public class NonDuplicates {
    public static void main(String[] args) {
        /*
        Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the non-duplicate number, which mean the ones that does not have two occurrences of it
         */

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        for (int i = 0; i < nums.length; i++) {
            int each = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                int match = nums[j];
                if (each == match){
                    count++;
                }
            } if(count == 1){
                System.out.println(each);
            }

        }




    }
}
