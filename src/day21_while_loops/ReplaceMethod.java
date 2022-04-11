package day21_while_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is Monday. Monday in your face. Sup Monday.";
        day = day.replace("Monday", "Tuesday");
        System.out.println(day);

        String str = "Today is Monday. Monday in your face. Sup Monday.";
        System.out.println(str.replaceFirst("Monday", "Tuesday"));

        String target = "Today is Monday. Monday. Sup Monday";
        int firstIndex = target.indexOf('.'); // we're relying on these periods '.' to find stuff.  If they weren't there it would be the same but harder.
        int secondIndex = target.lastIndexOf('.');
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("Monday", "Saturday");

        System.out.println(target.substring(0, firstIndex) + middleStr + target.substring(secondIndex));

    }
}
