package day10_scanner2;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three angle numbers:");
        double angleOne = keyboard.nextDouble();
        double angleTwo = keyboard.nextDouble();
        double angleThree = keyboard.nextDouble();

        double sum = angleOne + angleTwo + angleThree;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("Is a triangle: " + isTriangle);
        System.out.println("Is a circle: " + isCircle);

        if (sum == 180)
            System.out.println("Congratulations you have a triangle.");
        else
            System.out.println("Your angles don't equal 180 degrees so this isn't a triangle.");




    }
}
