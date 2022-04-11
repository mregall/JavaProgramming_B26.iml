package day32_multidimensional_arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW
        int biggest = -2000000000;
        for (int each : nums){
            if (each > biggest){
                biggest = each;
            }
        }
        System.out.println(biggest);

    }
}
