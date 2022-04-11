package additional_practice;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        /*
        less than 3   -> ineligible
        3-4           -> preschool
        5             -> kindergarten
        6-10          -> elementary school
        11-13         -> middle school
        14-18         -> high school
        19+           -> college
         */

        if(age < 3) {
            System.out.println("ineligible");
        } else if (age > 2 && age < 5) {
            System.out.println("preschool");
        } else if (age == 5) {
            System.out.println("kindergarten");
        } else if (age >= 6 && age <= 10) {
            System.out.println("elementary school");
        } else if (age >= 11 && age <= 13) {
            System.out.println("middle school");
        } else if (age >= 14 && age <= 18) {
            System.out.println("high school");
        } else if (age > 18) {
            System.out.println("college");
}}}
