package day11_if_statements;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temperature = input.nextInt(); // Scanner version, gets dynamic values from the console

//        int temperature = 100; // hard coded version

        if(temperature >= 70){
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("It's too cold");
            System.out.println("Code more java");
        }

    }

}
