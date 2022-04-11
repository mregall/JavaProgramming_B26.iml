package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // short is smaller than float, so no casting is needed.
        // that's why numTwo is grey'd out, it's redundant.


        System.out.println(numOne);
        System.out.println(numTwo);

       // float numb3 = 100.5;  // what's wrong here?  Its auto double, so we need the "F"

        float numb3 = 100.5F;

        // short num4 = numb3; --> what's wrong here? Its an explicit cast so it needs to be formatted as below.

        short num4 = (short)numb3; // the TYPE of the cast goes in the parenthesis
        // the Variable goes after it.

        float numb5 = 30; // 30 is an int by default, but can auto be made into a float

        // Improper casting is a cause for dataloss.  This is on you the programmer. You will have to fix it.










    }
}
