package day19_string3;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p"));//it finds the position of the letter/char you're looking for
        System.out.println(s.indexOf("x"));//whenever you look for something that isn't there it gives -1 instead of an error.
    }
}
