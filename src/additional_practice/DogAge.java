package additional_practice;

import javax.swing.*;
import java.time.LocalTime;
import java.util.Scanner;

public class DogAge {
    public static void main(String[] args) {
        //dog age calculator

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your dog's age: ");
        double dogAge = input.nextDouble();
        double humanAge = 0;

        if (dogAge <= 2) {
            humanAge = dogAge * 11;
        } else {
            humanAge = 22 + ((dogAge - 2) * 5);
        }
        System.out.println(humanAge);

        int sum = 0;
        for (int i = 0; i <= 10; i++)
            sum += i;
        System.out.println(sum);

    }
}
