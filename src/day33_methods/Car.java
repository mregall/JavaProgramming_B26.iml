package day33_methods;

public class Car {
    /*
    Unlock
    Open door
    Sit
    Close door
    Seatbelt
    Turn key
    into drive and go
     */

    public static void unlocktheCar(){
        System.out.println("Unlocking the door");
    }
    public static void opendoor(){
        System.out.println("Opening the door");
    }
    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }
    public static void getReadyToGo(){
        System.out.println("Putting on seatbelt");
        System.out.println("Check the mirrors");
        System.out.println("Turn on the radio");
        System.out.println("Program the navi");
    }
    public static void startCar(){
        System.out.println("Starting the car");
    }
    public static void driveAndGo(){
        System.out.println("Put car into drive");
        System.out.println("Hit the gas!");

    }
    public static void inAHurry(){
        unlocktheCar();
        opendoor();
        sitInCar();
        getReadyToGo();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        inAHurry();



    }
}
