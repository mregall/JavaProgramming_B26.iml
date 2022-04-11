package day36_method_overloading;

public class OverloadAndReturn {
    //exploring if you can overload by changing the return type.

    public static void method(){
        System.out.println("default empty method");
    }
    //Any overloaded methods can't have a return.
    //public static int method(){}....   wouldn't work
    //what you could do is ask for an argument

    public static int method(int a){
        return 0;
    }

    public static void main(String[] args) {

    }
}
