package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new App().run(); //This creates a null object
        //todo: understand what this is below.
        //after this we don't have access to the Scanner anymore.
        //I think he's trying to compare this to the line above with an unassigned instance
        new Scanner(System.in).nextLine();


    }
}
