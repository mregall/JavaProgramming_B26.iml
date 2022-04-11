package day27_nested_loops2;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = 356785;

        /*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     */
        for (int i = 245678; i <= range; i++) {
            //this loop checks all numbers from 2 to top of range

            int count = 0; // this is how many primes we get, right now we have none.

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i + ", ");
            }
        }


    }
}
