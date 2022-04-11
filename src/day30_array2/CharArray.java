package day30_array2;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));
        System.out.println(java); //char arrays will print, but then it's not an array.

        for (char eachChar : java){
            System.out.println(eachChar); // printing one letter on each line
        }
        System.out.println(java[0]); // print only one letter at element zero

        /*
        ==================================================================

        String and char have some inner workings within Java

        String s = "abc"
        is equal to
        s.toCharArray() 'a' 'b' 'c'

        ===================================================================

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'}
        is equal to
        String strDay = new String(day);

        ====================================================================
         */

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
        System.out.println(day); // even though these print the same, you can't use string methods on a char, so it would be useful to change to strDay if you needed to manipulate the data.

        System.out.println("------------------------------------------------");
        /*
        String str = "Today is Monday"

        we can use str.split(" ") to make an array of {"Today", "is", "Monday"}
         */

    }
}
