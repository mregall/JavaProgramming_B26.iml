package day31_Arrays_methods;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        //turn the string into a string array

        String [] allzones = zones.split(",");
        System.out.println(Arrays.toString(allzones));

        for (String eachZone : allzones){
            System.out.println(app + " is deploying on " + eachZone);
        }

    }
}
