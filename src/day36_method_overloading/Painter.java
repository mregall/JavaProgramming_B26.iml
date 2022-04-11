package day36_method_overloading;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("blue", "white");
    }
}
