package day42_custom_classes;

public class Item {

    String name;
    double price;

    @Override
    public String toString(){
        return "Item {" + "name='" + name + '\'' + ", price =" + price + '}';
    }

}
