package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);

        x++; // this is equivalent in java to x+1

        System.out.println(x);

        x--;// this is obviously the same as x-1.  Note how we can change the value of x as we move through the code.

        System.out.println(x);

        ++x; // pre-increment and post-increment

        System.out.println(x);

/*
Difference between the pre / post increment.  The pre does the math before printing.  The post does the printing then the math.
 */
    }
}
