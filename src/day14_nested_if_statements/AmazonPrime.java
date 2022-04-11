package day14_nested_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        /*
        Declare 'price' variable
        boolean 'hasPrime'

        prime has 2 day

        not prime AND over $25 = free shipping

        not prime & less than 25 = 3.99

         */

        double price = 15;
        boolean hasPrime = false;

        if(hasPrime) {
            System.out.println("Eligible for 2 day shipping");

        } else {

            if(price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping.  Shipping is $3.99");
            }
        }


    }
}
