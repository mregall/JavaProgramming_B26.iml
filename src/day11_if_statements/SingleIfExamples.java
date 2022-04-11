package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {
        if (false) { // we're using hard coded boolean's to show false doesn't work and true does
            System.out.println("Hello World");
        }

        if (true) { // IJ is highlighting because it's weak code.
            System.out.println("It's Monday");
        }

        int score = 80;
        if (score >= 75) {
            System.out.println(score + " is Passing");
        }

        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown) {
            System.out.println("Stay at Home");
            System.out.println("Wear a mask while doing Java");
        } else {
            System.out.println("Burn all your old masks");
        }

        if (!lockdown) {
            System.out.println("Party");

            System.out.println("lockdown = " + lockdown);
            System.out.println("score = " + score);
            System.out.println(lockdown);


            String variableName = "Cool Trick";
            //type variableName.soutv and the line below appears
            System.out.println("variableName = " + variableName);

            double d = 5.5;
            int i = (int)d;

            System.out.println(i);
        }
    }

}
