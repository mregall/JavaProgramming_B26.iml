package additional_practice;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        /*
        Even and odd from array
        Write a program that can count the even and odd number from an array of
        integers
        Ex:
        Input: [4,1,3,12,5]
        Output:
        Even: 2
        Odd: 3
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int [] evenOddArray = new int[number];
        int even = 0;
        int odd = 0;

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

