package day10_scanner2;
import java.util.Scanner;
public class YourInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your favorite book? ");
        String favoriteBook = in.nextLine();


        System.out.print("What is your age? ");
        byte age = in.nextByte();

        System.out.print("What is your favorite number? ");
        long favoriteNumber = in.nextLong();

        System.out.println("What is your favorite book? ");
        String favoriteBook2 = in.nextLine();

        in.nextLine();




    }
}
