package replits;

import java.util.Scanner;

public class BiggestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW


        String biggest = words[0];

        for (String each : words){
            if (each.length() > biggest.length()){
                biggest = each;
            }

            }
        System.out.println(biggest);
        }

    }

