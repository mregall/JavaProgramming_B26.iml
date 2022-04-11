package day34_methods_return;

public class CreditScore {
    /*
    one void, one not.
     */

    public static void main(String[] args) {

        getCreditScore(); // nothing happens here.

        int score = getCreditScore();
        System.out.println(score); // now we get our number
        System.out.println(getCreditScore() + 50); // we can call data to use later
        System.out.println(isGoodCreditScore(800) ? "good score" : "bad score");

    }
    public static int getCreditScore(){
        return 800;
    }

    public static boolean isGoodCreditScore(int creditScore) {

        return creditScore >=700;

       /* if (creditScore > 700) {
            return true;
        }else{
            return false;
        }*/
    }

}
