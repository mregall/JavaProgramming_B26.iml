package day51_inheritance.device;

public class TV extends Device{

    public TV(String brand) {
        super(brand);
    }

    public TV(String brand, String model) {
        super(brand, model);
    }

    public TV(String brand, String model, double price) {
        super(brand, model, price);
    }

    public TV(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    @Override
    public void useDevice(String model) {
        super.useDevice(model);
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}
