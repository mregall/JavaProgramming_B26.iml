package day49_inheritance.Animals;

import day49_inheritance.Animals.Animal;
import day49_inheritance.Animals.Dog;
import day49_inheritance.Animals.Lion;

public class Zoo {
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;

        Lion lion = new Lion();


    }
}
