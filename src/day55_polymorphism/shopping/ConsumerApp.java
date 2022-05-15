package day55_polymorphism.shopping;

public interface ConsumerApp extends Shipping, AllowUserToSell{

}

abstract class TestA implements Shipping, AllowUserToSell{}

abstract class TestB implements ConsumerApp{}

//This is just saying there is now sufficient structure to develop in different ways.
//As long as you create within the bounds, that's okay.
