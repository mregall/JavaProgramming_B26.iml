package at_office_hours;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Task 01 : SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
         */
        System.out.println("Type some stuff:");
        String stuff = input.nextLine();
        int numbers = 0;

        for (int i = 0; i < stuff.length(); i++) {

            if (stuff.charAt(i) >= '0' && stuff.charAt(i) <= '9'){
                numbers += stuff.charAt(i) - 48;
                // the -48 is because the ascii value is 48 above each char.
                // so simple
            }
        }
        System.out.println(numbers);

    }
}
