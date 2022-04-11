package day19_string3;

public class MergeString {
    public static void main(String[] args) {
        String abc = "abc";
        String xyz = "xyz";
        String newString = abc + xyz;
        System.out.println(newString);

        String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0);
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);


        System.out.println(merged);

    }
}
