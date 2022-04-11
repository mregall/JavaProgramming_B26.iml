package day28_array_intro;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */
        int [] num = {500, 120, -80, 90, 250, - 10};
        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            int number = num[i];//this isn't necessary.  It could be just num[i]

            if(number > max){
               max = number;//min/max has to be changed to the number
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println(min + " " + max);

        //remember Math.max(x, y); or Math.min(x, y);


        System.out.println("what is the size of the array?");
        int size = input.nextInt();

        int [] userSize = new int[size];


        System.out.println(Arrays.toString(userSize));
        for (int i = 0; i < userSize.length; i++) {
            System.out.println("enter a number");
            userSize[i] = input.nextInt();


        }}

    }

