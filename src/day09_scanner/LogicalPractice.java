package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {


        /*
        Logical:
        "and" = &&  -> (sum > min) && (sum < max)
        "or" = ||   -> (answer == 'y') || (answer == 'Y')
        "not" !     -> !(number < 0)

        The operator = is the assignment operator. Although this symbol means
        equality in mathematics, it does not have this meaning in Java. If you write if
        (x = y) instead of if (x == y) to test whether x and y are equal, you will get
        a syntax error message.

         */
        int n = 6;

        System.out.println(n>5 && n<10); //boolean "and" is &&
        System.out.println(n<10);






    }
}
