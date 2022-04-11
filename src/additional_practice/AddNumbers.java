package additional_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum = num1+num2+num3;
        System.out.println("Sum of numbers: " + sum);
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
