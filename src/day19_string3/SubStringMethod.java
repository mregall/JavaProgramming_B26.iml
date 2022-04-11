package day19_string3;

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "Sunday";
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        //substring allows you to use part of a string while keeping the rest of it.
        //seems useful for ssn type applications or security purposes
        System.out.println(str.substring(2, 4)); //nd
        //this will display 2 and 3 the four is where you stop.
        System.out.println(str.substring(1, 5));//unda
        //got it
        System.out.println(str.substring(0, 6));//works
        //System.out.println(str.substring(0, 7));//doesn't work


    }
}
