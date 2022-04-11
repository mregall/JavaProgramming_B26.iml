package additional_practice;
import java.util.Locale;
import java.util.Scanner;
public class HasJava {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW
        if(email.toLowerCase().contains("alejandro") && email.toLowerCase().contains("project")){
            System.out.println("priority");
        }else if(email.toLowerCase().contains("alejandro")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }



    }

    }

