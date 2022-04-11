package day09_scanner;

public class Discount {
    public static void main(String[] args) {
        /*
        declare and assign -->
        is it the weekend
        are you a teacher
        are you a police officer
        are you a firefigher

        Do you get a discount?
            Discount if weekend and you must be a public servant.

         */

        boolean isWeekend, isTeacher, isPolice, isFire, discount;
        isWeekend = true;
        isTeacher = false;
        isPolice = false;
        isFire = true;

        discount = isWeekend && (isTeacher || isPolice || isFire);
        System.out.println(discount);





    }
}
