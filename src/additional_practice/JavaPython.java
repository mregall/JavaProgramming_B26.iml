package additional_practice;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
       int jcount = 0;
        int pcount = 0;

        for (int i = 0; i < sentence.length()-6; i++) {

            String everyFour = sentence.substring(i, i+4);
            String everyFive = sentence.substring(i, i+6);

            if (everyFour.equals("java")) {
                jcount++;
            }else if (everyFive.equals("python")){
                pcount++;
            }}
        //System.out.println(jcount);
        //System.out.println(pcount);
        System.out.println(jcount == pcount);

    }}

