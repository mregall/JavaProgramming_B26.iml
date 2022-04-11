package day05_variables2;

public class RecapVariables {
    public static void main(String[] args) {
      byte numberOfCoffeeCups;
      double totalPriceOfCoffee;
      int totalStudentInClass;

      numberOfCoffeeCups = 2;
      totalPriceOfCoffee = 10.25;
      totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        double revenue = totalPriceOfCoffee * totalStudentInClass;

        System.out.println("$" + revenue);

        double temperature = 20;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " in java class.");


    }
}
