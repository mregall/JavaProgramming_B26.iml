package day15_switch_statements;

public class FirstSwitchWithExplanation {
    public static void main(String[] args) {
        /*
        Take a number and print the number as the word that represents the number.
        One through five


    switch statements only compare exact values ==

        -> relational operators ( > < >= <= !=) are not allow in switch

    switch(variable) {

        case x:
            // statements
            break;

        default:

    }

    switch: keyword to make a switch statement

    variable: value being checked/compared in the switch
        on these types are allowed: byte, short, int, char, String

        which means these types are not allowed: float, double, long, boolean

    case: value that you are checking for. The datatype of the case should match the datatype of the variable being checked

    statements: any code you want to run when the case matches

    break: stops and exits the switch statement


         */
        int n = 5;

        if(n == 4){
            System.out.println("Four");
          // ...and the rest...
        }else{
            System.out.println("Invalid Number");
        }

        switch (n) {
            case 1: //if(n==1)
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
        }
/*
        Execution flow:
            if statements: go top to bottom.  Checking each "if" as it goes down.

            switch statement: the case matches first, THEN the statements are
            executed, top to bottom, from that case until the end of the switch or
            the break keyword.

            So the switch to the break is the "curly brackets"

 */





    }
}
