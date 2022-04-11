package additional_practice;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {

            //DO NOT TOUCH BELOW:
            Scanner s = new Scanner(System.in);

            int grade = s.nextInt();

            if(grade >= 90) {
            System.out.println("excellent");
        } else if (grade >= 70) {
            System.out.println("good");
        } else if (grade >= 60) {
            System.out.println("pass");
        } else if (grade > 60) {
            System.out.println("fail");
    }}}

