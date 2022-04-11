package day33_methods;
/*

       make a method that prints all the letters from A - Z

       make a method that prints all the letters from a - z

       make a method that prints all the letters from Z - A

       make a method that prints all the letters from z - a

       make a method that prints all the numbers from 0 - 9

    */
public class GetChars {
    public static void AtoZ(){

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        }
    public static void LowercaseAToZ(){

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void AtoZBackwards(){

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void Lowerbackwards(){

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void Numerical(){

        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    }

