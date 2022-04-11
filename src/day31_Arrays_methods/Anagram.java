package day31_Arrays_methods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String listen = "listen";
        String silent = "silent";
        char [] listen1 = listen.toCharArray();
        char [] silent1 = silent.toCharArray();

        Arrays.sort(listen1);
        Arrays.sort(silent1);
        System.out.println(Arrays.equals(listen1, silent1));




    }
}
