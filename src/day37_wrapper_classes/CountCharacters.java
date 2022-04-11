package day37_wrapper_classes;

import java.util.Arrays;

public class CountCharacters {
    /*
    Given a string, count all the uppercase, lowercase, numbers, and other stuff.
    jhgdJYFUTEDT2543643$&^%*((67
     */
    public static void main(String[] args) {

        String s = "jhgdJYFUTEDT2543643$&^%*((67";
        int upper = 0, lower = 0, number = 0, other = 0;
        String upperCaseLetters = "";

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.isUpperCase(letter)){
                upper ++;
                upperCaseLetters += letter;
            }else if (Character.isLowerCase(letter)){
                lower ++;
            }else if (Character.isDigit(letter)){
                number ++;
            }else{
                other ++;
            }
        }
        System.out.println("upper = " + upper);
        System.out.println("uppercase letters " + Arrays.toString(upperCaseLetters.toCharArray()));
        System.out.println("lower = " + lower);
        System.out.println("number = " + number);
        System.out.println("other = " + other);

    }







}
