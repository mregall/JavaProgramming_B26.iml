package additional_practice;
import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        /*

        There will be an int house value and an int player value. Use the following rules of blackjack to print out the result:

if the player score is bigger than 21, the result is player bust
if the player score is equal to the house score, the result is it's a tie
if the player score is equal to 21, the result is player win
if the house score is bigger than the player score, the result is player lose
if the player score is bigger than the house score, the result is player win
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter player and house numbers");
        int house = s.nextInt();
        int player = s.nextInt();

        if (player > 21)
            System.out.println("player bust");
        if (player == house)
            System.out.println("player win");
        if (player == 21)
            System.out.println("player win");
        if (house > player)
            System.out.println("player lose");
        if (player > house)
            System.out.println("player win");

        int a = 30;
        byte b = 10;
        b +=a;
        System.out.println(b);

        int price = 24;
        price = price+1;
        System.out.println("price = " + price);
        // These equations are really saying x is the result of the calculation in y
        // x = y
        // therefore the right is evaluated to determine the left
        int result = 0;
        int addition = 1;
        result = addition + addition;
        System.out.println("result = " + result);
        result += 1;
        System.out.println("result = " + result);


        String name1 = "Pinky", name2 = "pinky";
        boolean sameName1 = name1.equals(name2);
        boolean sameName2 = name1.equalsIgnoreCase(name2);
        System.out.println("sameName1 = " + sameName1);
        System.out.println("sameName2 = " + sameName2);
    }
}
