package at_office_hours;

import java.util.Scanner;

public class EncryptPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Task 03 : EncryptPassword

              Given a string password. Encrypt with "x" a given password and print.
               * password: cydeo
               * encrypt with char :x
               * output:cxyxdxexox
         */
        System.out.println("Enter a password to be encrypted:");
        String pass = input.next();
        String encrypted = "";

        for (int i = 0; i < pass.length(); i++) {
            encrypted += pass.charAt(i) + "x";
        }
        System.out.println(encrypted);
    }
}
