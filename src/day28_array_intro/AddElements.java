package day28_array_intro;

import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        declare and assign an array of numbers then add them all
         */

        int [] declared = {4, 4, 4, 4};
        int count = 0;

        for (int i = 0; i < declared.length; i++) {
            count += declared[i];

        }
        System.out.println(count);
    }
}
