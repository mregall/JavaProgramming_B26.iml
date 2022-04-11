package day22_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        //while loops are usually used when the number of iterations is undefined

        Scanner input = new Scanner(System.in);
        boolean keepTalking = true;

        while(keepTalking){
            System.out.println("Enter a message");
            String msg = input.nextLine();

            switch (msg){

                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("I'm good");
                    break;
                case "bye":
                    System.out.println("No, stay");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I don't understand");


            }

        }


    }
}
