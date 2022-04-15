package day33_methods;

public class first {
    public static void main(String[] args) {
        String str = "Password";
        if (str.length()>3){
            System.out.println(str.substring(0,3));
        }else{
            System.out.println("password must be at least 3 characters long");
        }
    }
}
