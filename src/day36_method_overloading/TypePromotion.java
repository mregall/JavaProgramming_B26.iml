package day36_method_overloading;

public class TypePromotion {

    public static void main(String[] args) {
        use(3); // this calls long
        use(3.5); //double
        use(1.2f); //float
        use(3L); //use the L for long
    }

    public static void use(float f){
        System.out.println("calling float method");
    }

    public static void use(double d){
        System.out.println("calling double method");
    }

    public static void use(long l){
        System.out.println("calling long method");
    }

}
