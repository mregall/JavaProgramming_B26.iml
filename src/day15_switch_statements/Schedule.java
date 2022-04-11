package day15_switch_statements;
import java.util.Scanner;
public class Schedule {
    public static void main(String[] args) {
/*
         Task:

            Ask the user to enter which day it is
            print which class we have on that day, and the time of the class
            show if there is office hours

            topic with instructor at time

            challenge:
                make each day flexible

                    monday
                    Monday
                    mon

                 reduce repeating code

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Day");
        String day = input.next();

        String hours = "";

        switch (day){
            case "Monday": case "monday": case "mon":
                hours = "Java with Saim at 7pm EST";
                break;
            case "Tuesday": case "tuesday": case "tue":
                hours = "Java with Saim at 7pm EST and office hours at 5:30pm";
                break;
            case "Wednesday": case "wednesday": case "wed": case "Thursday": case "thursday": case "thur":
                hours = "Soft skills with Nadir at 7pm EST";
                break;
            case "Friday": case "friday": case "fri":
                hours = "Our day off";
                break;
            case "Saturday": case "saturday": case "sat": case "Sunday": case "sunday": case "sun":
                hours = "Java with Saim 10am to 5pm EST";
                break;

            default:
                hours = "Not a valid day";

        }

        System.out.println(hours);







    }
}
