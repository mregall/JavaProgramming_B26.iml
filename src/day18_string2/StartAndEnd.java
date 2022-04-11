package day18_string2;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App"));// this instance is searching the data in the variable
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apples"));

        String s = "A";
        System.out.println(str.startsWith(s));// this instance is checking the String name
        System.out.println(str.startsWith("Aoo"));// this shows that all them have to be correct

        String sentance = "today was a good day";
        System.out.println(sentance.startsWith("today was a"));
        System.out.println(sentance.endsWith("day"));//true
        System.out.println(sentance.endsWith(" day"));//true
        System.out.println(sentance.endsWith("good"));//false the space makes it not

    }
}
