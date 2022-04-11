package day23_for_loop;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2000000000;
        int min = 2000000000;

        int iterations = 0;

        while (iterations < 5){
            iterations++;

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println();
    }
}
