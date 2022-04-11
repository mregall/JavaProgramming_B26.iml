package day24_for_loops2;

public class AsciiLoop {
    public static void main(String[] args) {
        String ascii = "java";


        for (int i = 0; i < ascii.length(); i++) {

                System.out.print(ascii.codePointAt(i) + " ");


    }
}}
