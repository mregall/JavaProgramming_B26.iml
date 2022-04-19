package day48_encapsulation2;

public class OrderPizza {
    public static void main(String[] args) {

        Pizza first = new Pizza("large", 3);
        System.out.println(first);
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        //we've given it no valid data here.
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(1);
        System.out.println(second);
    }
}
