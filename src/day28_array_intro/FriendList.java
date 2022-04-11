package day28_array_intro;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        /*

         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends?");
        int size = input.nextInt();
        String bugSize = input.nextLine();

        String [] userSize = new String[size];



        for (int i = 0; i < userSize.length; i++) {

            System.out.println("enter a name");
            userSize[i] = input.nextLine();
    }
        System.out.println(Arrays.toString(userSize));
}}
