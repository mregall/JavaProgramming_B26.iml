package replits;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }


        //WRITE YOUR CODE BELOW:

        String elements = "";
        String next = "";

        for (int i = 0; i < arr.length-1; i++) {
            elements = arr[i];
            next = arr[i+1];
            System.out.println(elements + ", " + next);
            i++;
        }
    }
}
