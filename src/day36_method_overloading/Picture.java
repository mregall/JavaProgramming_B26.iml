package day36_method_overloading;

public class Picture {

    public static void draw(){
        System.out.println("trying to draw...");
    }
    public static void draw(String color){
        System.out.println("drawing with a " + color + " crayon");
    }
    public static void draw(String color, String color2){
        System.out.println("getting artistic with " + color + " and " + color2);
    }
    public static void draw(int size){
        System.out.println("drawing with " + size + " colors");
        //you can only have one int per method.  You can input two ints, but not just two single ints with different names
    }

}
