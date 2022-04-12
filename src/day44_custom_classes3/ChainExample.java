package day44_custom_classes3;

public class ChainExample {

    //because there's absolutely no argument, it just prints everytime it sees any use of ChainExample
    public ChainExample(){
        System.out.println("First");
    }

    //this one will print anything that looks like an int
    public ChainExample(int i){
        this();
        System.out.println("Second");
    }
    //again but string
    public ChainExample(String s){
        this();
        System.out.println("Third");
    }

    //here we have a double but an int inside this() brackets.  So it prints second and fourth.  If you delete that it won't print second.
    public ChainExample(double d){
        this(0);
        System.out.println("Fourth");
    }
}
