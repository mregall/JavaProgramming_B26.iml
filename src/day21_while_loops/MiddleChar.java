package day21_while_loops;

public class MiddleChar {
    public static void main(String[] args) {
        /*
        [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
    Ex:
    Input: elephant
    Output: The middle characters: ph
         */

        // int len = s.length()/2;  --> this cleans up the code a little

        String word = "abcdef";
        if(word.length()%2==0){
            //even number of characters
            char firstMiddle = word.charAt(word.length()/2 -1);//char firstMiddle = s.charAt(len-1);
            char secondMiddle = word.charAt(word.length()/2);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println(word.substring(word.length()/2 -1, word.length()/2 +1));

        }else{
            //odd number
            char middle = word.charAt(word.length()/2);
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + word.substring(word.length()/2, word.length()/2 + 1));
            //the second on is like this cause the first and second number don't count the same.
            //(First starts before the first char, second ends after the last char)
        }
    }
}
