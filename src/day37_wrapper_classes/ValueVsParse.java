package day37_wrapper_classes;

public class ValueVsParse {
    public static void main(String[] args) {
        String s = "30";

        int seconds = Integer.parseInt(s);
        Integer i = Integer.valueOf(s);
    }
}
