package additional_practice;
import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");


        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();


        //WRITE YOUR CODE HERE:

        if(a>b) System.out.println(a + " is greater");
        else System.out.println(b + " is greater");




    }
}
