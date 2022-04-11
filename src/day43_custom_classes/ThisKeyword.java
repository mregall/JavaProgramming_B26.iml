package day43_custom_classes;

public class ThisKeyword {

    int a = 100; //instance variable

    public ThisKeyword(int a){

        a = 400; // local variable
        System.out.println(a);
        this.a = 600; // "this" reassigns the instance variable
    }

    /*
    "this" means the one that you're trying to set it to.
    Let's say there is a constructor  for street it would be this.street
    if I was working on myAddress as the object when I type myAddress.street
    myAddress is the "this"

    This has to be used in constructors

    A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
     */
}
