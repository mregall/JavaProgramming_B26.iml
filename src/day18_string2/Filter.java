package day18_string2;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
         /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine();
        message = message.toLowerCase();
        message = message.trim();
        // you could also write String message = input.nextLine().toLowerCase().trim();


        boolean badMessage = message.contains("java is bad")||message.contains("quit")||message.contains("have fun")||message.contains("crying");

        if(badMessage) {
            System.out.println(message + " failed to send");
        }else if (!badMessage){
            System.out.println(message + " was sent");
    }
        System.out.println("Please enter your message");
        String msg = input.nextLine(); // input.nextLine().toLowerCase().trim();
        msg = msg.toLowerCase();
        msg = msg.trim();

        if(msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
            System.out.println("Message failed to send");
        } else {
            System.out.println(msg + " was sent");
        }
}}
