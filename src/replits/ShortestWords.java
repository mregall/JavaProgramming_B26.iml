package replits;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence
 */

public class ShortestWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        System.out.println("Enter Words");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str);

        /*//WRITE YOUR CODE BELOW
        String list = "";
        String [] words = str.split(",");

        //System.out.println(Arrays.toString(words));
        String smallest = words[0];

        for (String each : words){
            if (each.length() <= smallest.length()){
                smallest = each;
            }
        }
        System.out.println(smallest.length());

        for (int i = 0; i < words.length; i++) {
            if (words[i].trim().length() == smallest.length()){
                list += words[i];
            }
        }

        *//*for (String check : words){
            if (check.length() == smallest.length()){
                list += check;
            }
        }*//*
        //list = list.trim();

        //System.out.println(smallest);
        //System.out.println(list);
        String [] results = list.split(" ");
        System.out.println(Arrays.toString(results));*/

        String [] strArr = str.split(", ");
        String str1 = strArr[0];
        int length = strArr[0].length();


        for(int i =1; i< strArr.length;i++){
            if(strArr[i].length()<length){
                str1=strArr[i];
                length=strArr[i].length();
            }else if (strArr[i].length()==length){
                str1+= " "+strArr[i];
            }

        }
        System.out.println(Arrays.toString(str1.split(" ")));

    }
}
