package day11_if_statements;
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing?");
        double withdraw = input.nextDouble();

      //  double balance = 100;
      //  double withdraw = 101;

        // need to withdraw some money.

        balance -= withdraw;

        if(balance <0){
            System.out.println("Your balance is negative, we have applied a $100 overdraft penalty.");
            balance -= 100;
        }

        System.out.println("Balance $ " + balance);







    }
}
