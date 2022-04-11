package day18_string2;

public class Contains {
    public static void main(String[] args) {
        String day = "Today it is above 70";
        System.out.println(day.contains("it is"));//true
        System.out.println(day.contains("itis"));//false, space is important
        System.out.println(day.contains("7"));//true, you can search for a single character
        System.out.println(day.contains("today"));//false, case sensitive


    }
}
