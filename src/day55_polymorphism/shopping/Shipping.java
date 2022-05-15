package day55_polymorphism.shopping;

public interface Shipping {
    /*
    Create an interface Shipping
        - Declare an abstract methods:
            payForShipping(boolean)
     */
    String country = "US"; //static variable

    void payForShipping(boolean b);
}
