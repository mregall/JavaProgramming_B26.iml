package day51_inheritance.device;

public class UseDevice {
    public static void main(String[] args) {

        Phone obj1 = new Phone("Apple", "iPhone", 1000.99, true);

        System.out.println(obj1);
        obj1.useDevice(obj1.model);

        TV obj2 = new TV("Samsung", "80 Inch", 1500.00, false);
        System.out.println(obj2);
        obj2.useDevice(obj2.model);
    }
}
