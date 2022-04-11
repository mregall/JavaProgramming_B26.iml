package day33_methods;

public class Email {
    public static void buildEmail(String name, String domain){
        String email = name.substring(0,1);
        int space = name.indexOf(" ");
        email += name.substring(space + 1, space + 4);
        email += "@" + domain + ".com";
        System.out.println(email);
    }

    public static void main(String[] args) {
        buildEmail("James Bond", "Gmail");
    }


}
