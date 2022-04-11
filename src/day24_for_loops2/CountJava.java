package day24_for_loops2;

public class CountJava {
    public static void main(String[] args) {
        /*
        java is a language
        012345

        java (0,4) same as (i, i+4)
        ava  (1,5)
        va   (2,5)
         */

        String str = "java is a java language";
        int count = 0;

        for (int i = 0; i < str.length()-3; i++){

            String everyFour = str.substring(i, i+4);

            if (everyFour.equals("java")){
                count++;
            }
        }
        System.out.println(count);


    }
}
