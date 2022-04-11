package day15_switch_statements;
import java.util.Scanner;
public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
       /* int num = input.nextInt();
        String num = "";

        switch (num){
            case 1:
                num = "Monday";
                break;
            case 2:
                num = "Tuesday";
                break;
            case 3:
                num = "Wednesday";
                break;
            case 4:
                num = "Thursday";
                break;
            case 5:
                num = "Friday";
                break;
            case 6:
                num = "Saturday";
                break;
            case 7:
                num = "Sunday";
                break;
            default:
                num = "Not a valid day";

        } System.out.println(num);

        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();
*/
        //WRITE YOUR CODE BELOW:

        String num = "";

        switch (num){
            case "200":
                num = "OK";
                break;
            case "201":
                num = "Created";
                break;
            case "202":
                num = "Accepted";
                break;
            case "307":
                num = "Temporary Redirect";
                break;
            case "400":
                num = "Bad Request";
                break;
            case "401":
                num = "Unauthorized";
                break;
            case "403":
                num = "Forbidden";
                break;
            case "404":
                num = "Not Found";
                break;
            case "410":
                num = "Gone";
                break;
            case "500":
                num = "Internal Server Error";
                break;
            case "303":
                num = "Service Unavailable";
                break;
            default:
                num = "Invalid status code";

        } System.out.println(num);


    }}
