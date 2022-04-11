package additional_practice;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        System.out.println("Hello, which item would you like?");
        Scanner scan=new Scanner (System.in);
        String item = scan.next();

        String message = "";
        int balance = 100;
        //I know I want to make these messages their own string so they aren't repeated.
        //String purchase = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
        //String insufficient = "Sorry, not enough funds on your gift card";

        switch(item){

            case "Blanket":
                balance -= 60;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Charger":

            case "Socks":
                balance -= 5;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Hat":
                balance -= 25;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Headphones":
                balance -= 30;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Laptop":
                balance -= 200;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Pants":
                balance -= 50;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Pillow":
                balance -= 40;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "Smartphone":
                balance -= 1000;
                if (balance >= 0)
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            case "USB cable":
                balance -= 10;
                if (balance >= 0) {
                    message = "Thank you for your purchase!\nYour current balance is: " + balance + "$";
                }else {
                    message = "Sorry, not enough funds on your gift card";
                }
                break;

            default:
                message = "Sorry, that is an invalid item";

        } System.out.println(message);

    }
}

