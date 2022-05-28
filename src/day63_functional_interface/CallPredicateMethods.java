package day63_functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);
        System.out.println(UsePredicate.isPalindrome.test("scenarios"));

        System.out.println(UsePredicate.isPrime.test(17));
    }
}
