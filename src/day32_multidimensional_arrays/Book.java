package day32_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters are there?");
        String [][] books = new String[input.nextInt()][];
        //System.out.println(Arrays.deepToString(books));
        input.nextLine(); //bug fix

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the name of chapter " + (i+1) + ":");
            String chapter = input.nextLine();
            String [] sentences = chapter.split(". ");
            books[i] = sentences;
        }
        System.out.println(Arrays.deepToString(books));

    }
}
