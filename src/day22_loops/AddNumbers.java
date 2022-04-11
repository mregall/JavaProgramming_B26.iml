package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        enter first number
            type number
        enter second number....

        up to 5

        How do we not repeat code?

         */
        int number = 1; // iteration
        int total = 0; // result

        while(number <=5){
            System.out.println("Enter number " + number);
            number++;
            total += input.nextInt();
        }
        System.out.println(total);
    }
}
