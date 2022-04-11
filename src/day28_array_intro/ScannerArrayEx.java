package day28_array_intro;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        String Array that stores info about a student.
        0 == ID
        1 == first name
        2 == last name
        3 == batch number
         */


        /*String [] studentManual = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentManual));

        String [] studentUnknown = new String[4];
        System.out.println(Arrays.toString(studentUnknown));
        studentUnknown[0]="008";
        //studentUnknown[1]...
        //studentUnknown[2]...

        String [] scannerIn = new String[4];
        System.out.println("ID");
        scannerIn[0] = input.nextLine();
        System.out.println("First Name");
        scannerIn[1] = input.nextLine();
        System.out.println("Last Name");
        scannerIn[2] = input.nextLine();
        System.out.println("Batch");
        scannerIn[3] = input.nextLine();*/

        String[] loopIn = new String[4];
        String [] questions = {"Enter your id", "Enter your first name", "Enter your last name", "Enter your batch number"};
        for (int i = 0; i < 4; i++) {
            System.out.println(questions[i]);
            loopIn[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(loopIn));
    }
}
