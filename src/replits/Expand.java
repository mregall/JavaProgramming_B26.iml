package replits;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        int [] newnums = new int[nums.length*2];
        System.out.println(Arrays.toString(newnums));
    }
}
