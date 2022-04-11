package day28_array_intro;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a month by typing a number 1 - 12: ");
        int selection = input.nextInt();

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",};

        System.out.println(months[selection -1]);
        //the -1 is because we start from zero
        //an alternate way to do this is to make the first element an empty space {"", "January",}

    }
}
