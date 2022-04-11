package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

        /*
        Not valid ways to import instance variables.
        System.out.println(name);
        System.out.println(People.name);
        we don't have instances of the variables yet, "instantiations
        */

            //Creating objects of the Person class
        Person personOne = new Person();
            //this instantiates an object
        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 6.0;
        personOne.isMarried = false;

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        System.out.println("\n>>============================~****~============================<<\n");

        Person personTwo = new Person();
        personTwo.name = "Regall";
        personTwo.age = 43;
        personTwo.height = 5.11;
        personTwo.isMarried = false;

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);


        Person personThree = new Person();



    }
}
