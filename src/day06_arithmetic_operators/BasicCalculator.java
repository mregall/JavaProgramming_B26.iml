package day06_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

      //  num1 + num2;  --> this doesn't work just like this because we don't do anything with the data.  We need print it or make it into a variable (container)

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);

        // concatenate that into a math problem

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

























    }





}
