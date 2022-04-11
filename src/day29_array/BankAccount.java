package day29_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        0 Full name
        1 account type
        2 account number
        3 balance
         */

        //read from the array
        String[] bankAccountOne = {"James Bond", "Checking", "134", "3.56"};
        System.out.println(bankAccountOne.length);
        System.out.println("Whole Array " + Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account type " + bankAccountOne[1]);
        System.out.println("Account Number " + bankAccountOne[2]);
        System.out.println("Balance " + bankAccountOne[3]);

        //assign to the array
        String[] bankAccountTwo = new String [4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "643";
        bankAccountTwo[3] = "5678899.00";
        //bankAccountTwo[6] = out of bounds problem
        System.out.println(Arrays.toString(bankAccountTwo));

        //scanner
        String [] bankAccountThree = new String[4];
        System.out.println("Enter your name:");
        bankAccountThree[0] = input.nextLine();
        System.out.println("Type of account");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("What is your balance?");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        String [] bankAccountFour = new String[4];
        String [] questions = {"full name", "account type", "account type", "balance"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.nextLine();

        }
        char [] chart = new char[5];
        System.out.println(Arrays.toString(chart));
    }
}
