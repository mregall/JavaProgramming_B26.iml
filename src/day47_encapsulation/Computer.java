package day47_encapsulation;

public class Computer {
    /*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

     */

    //this project is meant to show the difference between instance and static
    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    //add a static block - static block will run whenever this class is used.
    static {
        System.out.println("Class: Computer\n\t>>Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    //constructor
    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
