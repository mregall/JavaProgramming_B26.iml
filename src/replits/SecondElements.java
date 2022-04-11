package replits;

import java.util.Arrays;
import java.util.Scanner;

public class SecondElements {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        int second = 0;
        int last = nums.length-2;
        int secondLast = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 1) {
                second = nums[i];
            }
                if (i == last){
                secondLast = nums[i];
            }
            }

        System.out.println("Second element: " + second + "\nSecond to last element: " + secondLast);
    }
}
