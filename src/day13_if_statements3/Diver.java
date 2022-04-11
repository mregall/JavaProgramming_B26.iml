package day13_if_statements3;

import org.w3c.dom.ls.LSOutput;

public class Diver {
    public static void main(String[] args) {
        /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at at 50%


        int oxygenLevel = 50;

        if(oxygenLevel >= 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel >= 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel >= 70) {
            System.out.println("Don't go to far");
        } else if (oxygenLevel >= 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel >= 50) {
            System.out.println("Be careful now you're at 50%");
        }



        }
*/

        int oxy = 44;

    String message;

        if(oxy > 90){
        message = "Your tank is full";
    } else if (oxy > 80){  // else if(oxygenLevel > 80 && oxygenLevel <= 90)
        message = "Still okay";
    } else if(oxy > 70){
        message = "Don't go too far";
    } else if(oxy > 60){
        message = "Start to head back";
    } else if(oxy > 50){
        message = "Be careful now you are at 50%";
    } else {
        message = "Dangerous";

        System.out.println(message);
    }




    }}

