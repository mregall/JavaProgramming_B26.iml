package day23_for_loop;

public class CountLetter {
    public static void main(String[] args) {
        /*

            Given a String we want to count how many 'a' characters we have

            Challenge: adjust so that we can check for not only 'a' but any character

         */

        String letter = "asaaaadlkjb";
        int count = 0;


        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
