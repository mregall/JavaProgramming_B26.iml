package day24_for_loops2;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is a java language.java";
        int count = 0;

        while (str.contains("java")){
            System.out.println(str);
            str = str.replaceFirst("java", "*");
            count++;

        }
        System.out.println(str);
        System.out.println(count);
    }
}
