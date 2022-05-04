package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

        // you can't make an object of an interface

        Book obj = new Book();
        obj.read();
        obj.write();
    }
}
