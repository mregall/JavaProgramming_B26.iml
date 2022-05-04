package day52_inheritance.final_example;

public class UseFinalExample {

    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a); // a is always 5
        System.out.println(obj.b); // b is always specific to the instance and the original setting of the variable

    }
}
