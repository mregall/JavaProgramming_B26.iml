package day05_variables2;

public class CharExamples {
    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne+letterTwo);

        char letterThree = 65;  //char letterThree = 'A';  ASCII
        // A is the ascii value for the number 65
        // notice in letterThree there are no quotes or double quotes.
        // char letterThree = '65'; doesn't work because its redundant

        System.out.println(letterThree);

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne + " " + specialOne);

        System.out.println("chars: " + letterOne + letterTwo + letterThree + numberOne + specialOne);




    }
}
