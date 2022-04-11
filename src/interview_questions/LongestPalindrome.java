package interview_questions;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        [IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: {“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”}
Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */

        String [] phrases =  {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        //Outer loop is iterating through the array of elements
        //We set it to being a palindrome then prove that it isn't

        for (String eachWord : phrases) { //eachWord == phrases[i];
            boolean isPalindrome = true;

            //Inner loop is iterating through each element in the array
            //purpose of the loop is to check if the letters at beginning and end are NOT the same.
            //notice the .length()-1 - i allows you to iterate through and subtract

            for (int i = 0; i < eachWord.length()/2; i++) {
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1 - i)){
                    isPalindrome = false;
                    break;
            }

        }
            if (isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

    }
}
