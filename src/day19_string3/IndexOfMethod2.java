package day19_string3;

public class IndexOfMethod2 {
    public static void main(String[] args) {
       /*
            indexOf = Returns the index of the first occurrence of the substring a_string within this string or −1 if a_string is not found. Index numbers begin at 0.

            lastIndexOf = Returns the index of the last occurrence of the substring a_string within this string or −1 if a_string is not found. Index numbers begin at 0.
        */

        String s = "java is fun";
        System.out.println(s.indexOf('a'));//it looks for the first instance of the char
        System.out.println(s.lastIndexOf('a'));//finds the last instance of the char
        //ch: is a hint, ignore it

        String s2 = "abcbcb";
        System.out.println(s2.indexOf('b'));//single '' is a char search for a single char
        System.out.println(s2.lastIndexOf('b'));
        System.out.println(s2.indexOf("cb"));//double "" is a String search for an instance

    }
}
