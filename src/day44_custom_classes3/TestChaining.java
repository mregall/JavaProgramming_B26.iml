package day44_custom_classes3;

public class TestChaining {
    public static void main(String[] args) {

        ChainExample smith = new ChainExample(10);

        System.out.println("=================");

        new ChainExample("hello");

        System.out.println("+++++++++++++++++");

        new ChainExample(4.9);
    }
}
