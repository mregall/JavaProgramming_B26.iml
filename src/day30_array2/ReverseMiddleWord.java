package day30_array2;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        /*
        We have a sentence with three words.  Reverse the letters in the middle word.
         */

        String str = "java always fun";
        String [] words = str.split(" ");

        String reverse = "";

        char [] middleWord = words[1].toCharArray();

        for(int i = middleWord.length - 1; i >= 0; i--){
            reverse += middleWord[i];
        }

        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }
}
