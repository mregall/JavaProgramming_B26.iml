package day04_variables;

public class PrimativeDataTypes {
    public static void main(String[] args) {

        byte age = 60;
        System.out.println("age");
        System.out.println(age);

//         byte age2 = 200; --> This is the wrong type because byte only goes up to 127
//         *** Shortcut: "CTRL + /" starts a comment line.

        short year; // declared a variable called year.  Its is type "short"
        year = 2022; // assigned 2022 into my variable "year"
        year = 2023; // this is called re-assigning the variable when you change the value

        int addressNumber = 2444400;

        long bigNumber;
        bigNumber = 12345678900L; // you can use upper or lower case, but Upper is preferred.

//        compiler reads all whole numbers as "int" type by default.
//        therefore we need to add the letter "L" at the end of "long" type so it reads properly

    }
}
