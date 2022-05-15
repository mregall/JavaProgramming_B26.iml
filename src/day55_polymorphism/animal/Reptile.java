package day55_polymorphism.animal;

public class Reptile extends Animal{

    String skinColor;

    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
}
