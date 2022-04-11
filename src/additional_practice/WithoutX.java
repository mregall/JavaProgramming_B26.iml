package additional_practice;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE

        if(word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(1, word.length()-1));

        } else if (word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));

        } else if (word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(0, word.length()-1));
            
        } else {
            System.out.println(word);
        }

    }
}
