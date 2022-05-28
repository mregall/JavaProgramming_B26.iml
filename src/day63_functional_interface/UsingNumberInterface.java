package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {

            if (n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.apply(20);
        evenOrOdd.apply(25);

        NumberInterface cube = (n) -> {
            System.out.println(n*n*n);
        };

        cube.apply(3);
    }
}
