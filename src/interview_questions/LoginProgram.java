package interview_questions;

import java.util.Scanner;

public class LoginProgram {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                        scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

                // Do not touch above. Use array temps

                // from saim: please update to use a loop to have a different sized arrays
               double sum = 0;
                for (double data : temps) {
                     //System.out.println(data);
                      sum += data;
}
                System.out.println(sum/temps.length);
}}
