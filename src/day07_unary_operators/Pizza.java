package day07_unary_operators;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "Sausage and Pepps";
        int numberOfSlices = 31;
        int numberOfPeople = 4;
        int slicesPerPerson = numberOfSlices / numberOfPeople;
        int leftoverPie = numberOfSlices % numberOfPeople;

        String report = "We ordered " + typeOfPizza + " pizza with " + numberOfSlices + " slices, " + numberOfPeople + " people ate " + slicesPerPerson + " slices each with " + leftoverPie + " left over.";

        System.out.println(report);





    }
}
