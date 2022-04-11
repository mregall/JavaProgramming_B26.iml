package day25_loop_recap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        boolean isPrime = number >=2;




        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number + " is a prime number");

        }else {
            System.out.println(number + " isn't a prime number");
        }


    }
}
