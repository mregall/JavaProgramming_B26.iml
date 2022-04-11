package day42_custom_classes;

public class WildAnimals {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 100000000;
        bird.species = "Eagle";

        System.out.println(bird);

        Animal lion = new Animal();
        lion.species = "Scary lion";
        lion.population = 1000;
        System.out.println(lion);

    }
}
