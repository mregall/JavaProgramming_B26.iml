package day19_string3;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123  characters
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        /// and so on

        int lastIndex = s.length() - 1; // 4 - 1 = 3 (-1 because its 1 before the end)
        System.out.println("last char: " + s.charAt(lastIndex)); // this is the same as line 13, but line 13 is hardcoded

        int secondToLastIndex = s.length() - 2;
        char secondToLastChar = s.charAt(secondToLastIndex); // this is the same as line 12
        System.out.println("second to last character: " + secondToLastChar);


    }
}
