package day52_inheritance.final_example;

public final class FinalExample {
    //when a class is final there can't be inheritance

    final int a = 5;
    final int b;

    public static final String PLANET = "Earth";

    public FinalExample(int b){
        this.b = b;
    }
}
