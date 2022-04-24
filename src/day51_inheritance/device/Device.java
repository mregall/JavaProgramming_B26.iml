package day51_inheritance.device;

public class Device {

    String brand;
    String model;
    double price;
    boolean isWireless;

    public Device(String brand){
        this.brand = brand;
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Device(String brand, String model, double price, boolean isWireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
    }

    public void useDevice(String model){
        System.out.println("Using the " + model);
    }


    @Override
    public String toString() {
        return "This Device is the " +
                brand +
                ", " + model +
                " and the price is $" + price +
                ". It is Wireless: " + isWireless;
    }
}
