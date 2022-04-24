package day51_inheritance.device;

public class Phone extends Device {

    public Phone(String brand) {
        super(brand);
    }

    public Phone(String brand, String model) {
        super(brand, model);
    }

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public Phone(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    @Override
    public void useDevice(String model) {
        super.useDevice(model);
    }

    @Override
    public String toString() {
        return "This Phone is the " +
                brand +
                ", " + model +
                " and the price is $" + price +
                ". It is Wireless: " + isWireless;
    }
}
