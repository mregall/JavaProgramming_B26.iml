package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {
        /*

       I want to know the sign of the number
       if the number is positive
       if the number is negative or if its zero
         */

       int number = -2048;

       boolean isPositive = number > 0;
       boolean isNegative = number < 0;
       boolean isZero = number == 0; //you can't just use the == you need to make it double =


        System.out.println(number + " is positive: " + isPositive);
        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is Zero: " + isZero);



    }
}
