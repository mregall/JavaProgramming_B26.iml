package day19_string3;

public class IndexOfMethod3 {
    public static void main(String[] args) {
        String word = "definition";

        System.out.println("first i: " + word.indexOf('i'));
        System.out.println("last i: " + word.lastIndexOf('i'));

        System.out.println("second i: " + word.indexOf('i', 4));
        System.out.println("third i: " + word.indexOf('i', 6));

        //from the book
        int position = word.indexOf("ion");
        System.out.println(position);
        word = word.substring(0, position) + "e";
        System.out.println(word);
    }
}
