package day34_methods_return;

public class VoidVsReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
       //we now have a "return" method, so we need the keyword "return"
       //we can simply have s.out.

        return "Bye";
    }

    public static void main(String[] args) {
        sayHello(); // we couldn't put this into a variable because its not returning anything
        sayBye(); // this doesn't do anything, it gives us a value, but we need to do something with the value.
        System.out.println(sayBye()); //this works.
        String msg = sayBye(); // now we can store that value
    }
}
