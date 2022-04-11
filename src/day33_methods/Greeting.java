package day33_methods;

import java.util.Scanner;

public class Greeting {

    public static void hello(String name){ //we're using a variable with the method
        System.out.println("Hello " + name);
            }

    public static void main(String[] args) {
        hello("James"); //these are not stored.
        hello("Jamie");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine(); //this is stored.
        hello(name); //this is what prints

    }
}
