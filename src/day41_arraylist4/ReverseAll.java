package day41_arraylist4;

import day40_arraylist3.ArraylistWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;

public class ReverseAll {

       /*
    Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings @return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"} Output: {"det", "klat", "nrael"}
     */



    public static ArrayList<String> reverseAll(ArrayList<String> list){
        ArrayList<String> reverseWords = new ArrayList<>();

        for(String each : list){

            reverseWords.add(StringUtil.reverse(each));
        }
        return reverseWords;
    }

    public static void main(String[] args) {

    }

}
