package day09_scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        /* 39 * 2 + 3 - 5 % 5
            78 + 3 - 5 % 5
              78 + 3 - 0
                81 - 0
                   81

        Mult, Divide, and % are all first priority but we go left to right

         */

        System.out.println(w);


        int a = 8; //this is 7 because it's post decrement
        int b = a--; //this is 8 because it's post decrement

        System.out.println(a);
        System.out.println(b);

        int T = 50;
        int P = --T + T++ + T-- + T++;

        /*  49+49+50+49

        Because these are in the code, the code is changing the value at each stop in the
        concatenation.  So its really like P = --T = then T++ = then and etc.

        You can highlight a variable and right click to rename the variable.


         */

        System.out.println(T);
        System.out.println(P);

        int R = 20; //R20 19 20 19 18
        int W = -R-- + -R++ + --R * R-- % 2;
        /*
         -20 + -19 + 19 * 19 % 2
            -20 + -19 + 361 % 2
              -20 + -19 + 1
                   -38

         */
        int G = 8/0;

        System.out.println(G);





    }
}
