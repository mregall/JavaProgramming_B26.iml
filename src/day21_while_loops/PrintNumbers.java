package day21_while_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        /*
        Print all evens from 1 to 100
        Print all odds on one line
         */

        //even
        int even = 2;
        while (even <= 100){
            System.out.println(even);
            even = even + 2;//even += 2;
        }
        //second way...
        int e2 = 1;
        while(e2 <= 100){
            if(e2 % 2 == 0 ){
                System.out.println(e2);
            }e2++;
        }

        //odd
        int odd = 1;
        while(odd <= 100){
            System.out.print(odd);//(odd + " "); to separate
            odd += 2;
        }
        //odd second way..
        int b = 0;
        while(b++ <= 100){
            if(b % 2 == 1){
                System.out.print(b + " ");
            }
        }


    }
}
