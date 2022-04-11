package day29_array;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int [] evenOddArray = new int[number];
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < evenOddArray.length; i++) {
            System.out.println("enter an array value");
            evenOddArray[i] = input.nextInt();
            if (evenOddArray[i] % 2 == 0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }
}
