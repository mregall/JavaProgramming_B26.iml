package day18_string2;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "   Saturday   ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim();//this one is where immutable comes in. It will display shorter, but the variable isn't actually changed.

        System.out.println(s);
        System.out.println(s.length());

        String str = "      java is fun           ";
        System.out.println(str.startsWith("java"));//false
        str = str.trim();
        System.out.println(str.startsWith("java"));//true


    }
}
