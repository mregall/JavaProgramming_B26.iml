package day41_arraylist4;

import java.util.ArrayList;

public class AddStringNumbers {

    /*
    String numbers to sum
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input:
    “123”, “34”, “513” Output:
    [ 6, 7, 9 ]
     */

    public static ArrayList<Integer> sumFromString(ArrayList<String> list){
        ArrayList<Integer> sums = new ArrayList<>();

        //todo: this is a good one to review.


        for (String each: list){
            int currentSum = 0;
            for (String eachDigit : each.split("")){
                currentSum += Integer.parseInt(eachDigit);
            }
            sums.add(currentSum);//this is inputting the now totalled elements to the new string
        }
        return sums;
    }

}
