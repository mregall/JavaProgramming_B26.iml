package day18_string2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");
        String username = input.next();
        username = username.toLowerCase();
        System.out.println(username);

    }
}
