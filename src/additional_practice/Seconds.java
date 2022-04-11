package additional_practice;
import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds, remainingSeconds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        remainingSeconds = inputSeconds;
        hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;
        minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        seconds = remainingSeconds;

        System.out.println(hours + " hours, " + minutes + ", minutes, and " + seconds + " seconds");

    }
}
