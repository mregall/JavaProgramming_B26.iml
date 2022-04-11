package day26_nested_loops;

public class Month {
    public static void main(String[] args) {
        /*
        Go through a month one week at a time by day
         */
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week: " + week);
            for (int day = 1; day <= 7; day++) {
                System.out.println("\tDay: " + day);
            }
        }

    }
}
