package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone("iPhone X");
        System.out.println(myPhone);

        Phone yourPhone = new Phone("iPhone 13", "Apple");
        System.out.println(yourPhone);

        Phone burnerPhone = new Phone("Razor", "Motorola", 3, 2);
        System.out.println(burnerPhone);


    }
}
