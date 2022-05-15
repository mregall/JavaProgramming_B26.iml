package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

        Target target = new Target();
        target.price = 10;
        target.buyItem();
        target.returnItem();

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);   //this works
        System.out.println(Shipping.country); //this is the correct way
    }
}
