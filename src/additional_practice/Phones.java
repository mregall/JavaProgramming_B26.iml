package additional_practice;
import java.util.Scanner;
public class Phones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        //WRITE YOUR CODE BELOW

        String entry = "";

        switch(response){
            case 'y':
                entry = "Your request is being processed";
                break;
            case 'n':
                entry = "  Thank you for your consideration";
                break;
            case 'h':
                entry = "Sorry, no live agents are currently available";
                break;
            default:
                entry = "Invalid entry, please try again";
        } System.out.println(entry);

    }
}

