package day29_array;

public class AverageNumbers {
    public static void main(String[] args) {
        int [] numbs = {45, 6, 8, 234, 6};
        int sum = 0;

        /*for (int i = 0; i < numbs.length; i++) {
            sum += numbs[i];
        }
        System.out.println("Avg is: " + sum/numbs.length);*/

        System.out.println("---------------------");

        for (int each : numbs){
            sum+= each;
        }
        System.out.println("average: " + sum/numbs.length);
    }
}
