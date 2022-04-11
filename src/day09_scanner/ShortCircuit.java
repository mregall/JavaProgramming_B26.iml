package day09_scanner;

public class ShortCircuit {
    public static void main(String[] args) {
        System.out.println(true || 5/0 == 0);

        /*

        this is the "or" operator ||
        therefore it doesn't matter that the second half is nonsense
        When you use a single | it still means or, but it will calculate both sides
        but when you use a double || it just looks for the true side.

         */
        //









    }
}
