package additional_practice;

public class CbPosNeg {
    public static void main(String[] args) {

    }

    /*
    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

        posNeg(1, -1, false) → true   ---- else
        posNeg(-1, 1, false) → true   ---- else
        posNeg(-4, -5, true) → true   ---- if statement

        if   -->   -,-,true
        else -->   +,-,false <or>
                   -,+,false
        The rest are false.
     */

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {    //this means (?, ?, true)
            return (a < 0 && b < 0); // if (-,-,true) or neg == false
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
    }
