package day51_inheritance.app;
//main method class where we run the code
public class AppStore {
    public static void main(String[] args) {

        Instagram obj1 = new Instagram(3.2);
        obj1.download();
        obj1.postPicture();

        YouTube obj2 = new YouTube(1.4);
        obj2.download();



    }
}
