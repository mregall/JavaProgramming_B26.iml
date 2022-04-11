package additional_practice;
import java.util.Scanner;
public class MiddleNumber {
    public static void main(String[] args) {
        /*

        Hint:

        1. Create an object of Scanner class.
        2. Declare int 3 variables
        3. Use Scanner to assign numbers from console into the variables
        4. Use if statements to find the middle number

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter third number: ");
        int c = input.nextInt();

        if ((a < b && b < c) || (c < b && b < a))
            System.out.println("middle number is: " + b);

            // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
            System.out.println("middle number is: " + a);

        else
            System.out.println("middle number is: " + c);





    }
}
