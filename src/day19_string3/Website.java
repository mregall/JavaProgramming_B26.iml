package day19_string3;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
          /*

    Task

        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com

        --> google
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a url");
        String url = input.nextLine();
        String website = url.substring(4, url.length()-4);






    }
}
