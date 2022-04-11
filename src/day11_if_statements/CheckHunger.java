package day11_if_statements;
import java.util.Scanner;
public class CheckHunger {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry? true or false");
        boolean isHungry = input.nextBoolean();

//        boolean isHungry = true; // hard coded version

        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you");
        } else {
            System.out.println("Great, then practice java");
        }
    }
}