package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        /*
        you're working on a piece of art
        this program will help us pick UNIQUE colors
        flow: ask for a color 3 times
        figure out a way to get unique colors before continuing loop
         */
        Scanner input = new Scanner(System.in);
        int colorsPicked = 0; // iterations variable
        String uniqueColors = ""; // output variable

        while(colorsPicked < 3){
            System.out.println("Pick a color");
            String color = input.nextLine();

            // if we don't get a unique color, solve that first
            if(uniqueColors.contains(color)){
                System.out.println("You already have that color");
            } else {
            // when we do get a unique color continue the program
            uniqueColors += color + " ";
            colorsPicked++;

        }
        System.out.println(uniqueColors);


    }
}}
