package day52_inheritance.hiding;

public class Soccer extends Sports{

    /**
     * Static methods do not over-ride, they're just hidden.  Memorize it.
     */

    public static void cheer(){
        System.out.println("Cheering from the Child class");


    }
}
