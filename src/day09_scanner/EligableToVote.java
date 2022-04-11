package day09_scanner;

public class EligableToVote {
    public static void main(String[] args) {
        /*
        create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

     */

        String name;
        boolean isCitizen, isCriminal, isEligible;
        int age;

        name = "Regall";
        isCitizen = true;
        isCriminal = false;
        age = 43;

        isEligible = age >= 18 && isCitizen && !isCriminal;

        System.out.println(name + " is eligible to vote: " + isEligible);






    }
}
