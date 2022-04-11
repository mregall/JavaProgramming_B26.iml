package day31_Arrays_methods;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));
        // this is how we go from an array back to a String

        System.out.println(String.join("<>", words)); // a<>b<>c
        System.out.println(String.join(" ", words)); // a b c

}}
