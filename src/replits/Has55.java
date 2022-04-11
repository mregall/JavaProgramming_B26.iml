package replits;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TYPE YOUR CODE BELOW:
        boolean isFiftyFive = false;

        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i] == 5) && (nums[i+1] == 5)){
                isFiftyFive = true;

        }
            }

        System.out.println(isFiftyFive);

    }
}
