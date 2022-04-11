package day14_nested_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        /*
        pin 1552
        ssn 1234

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last 4 of your SSN: ");
        int userSSN = input.nextInt();

        System.out.println("Enter your pin: ");
        int userPin = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

     if(userPin == expectedPin && userSSN == expectedSSN) {
         System.out.println("Authentication successful");
     } else {
         if (userSSN == expectedSSN && userPin != expectedPin) {
             System.out.println("incorrect pin code");
         } if (userSSN != expectedSSN && userPin == expectedPin)
             System.out.println("invalid SSN");
            } if (userSSN != expectedSSN && userPin != expectedPin)
             System.out.println("authentication failed");
     }
    }
