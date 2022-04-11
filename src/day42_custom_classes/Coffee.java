package day42_custom_classes;

public class Coffee {

    String brand;
    double price;
    int size;
    String type;

    @Override
    public String toString(){
        return "Our first item is from " + brand + " and is a " + size + " oz.\nThis Americano is $" + price;
    }

    public void drink(){
        System.out.println("Drinking " + type);
        size -= 1;
    }

    public void refill(int size){
        System.out.println("Refilling " + size + "oz of coffee.");
        size += size;
    }
    //java prioritized the local variable.  ie. it took size after the drinks were already out of it.

}
