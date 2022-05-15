package day57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("enter a number");
            int num = input.nextInt();

            System.out.println("enter number 2");
            int num2 = input.nextInt();

            System.out.println(num/num2);


        }catch (InputMismatchException obj){
            obj.printStackTrace(); // shows the exception message in the console
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY BLOCK");
            input.close();
        }

        System.out.println("DONE");

    }
}
