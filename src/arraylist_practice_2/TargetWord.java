package arraylist_practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    /*
    Target word
        Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
        Ex:
        Input:
        ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
        Target: java
        Output:
        2
     */
    public static void main(String[] args) {

        ArrayList<String> times = new ArrayList<>(Arrays.asList("java", "java", "stuff", "java"));
        int count = 0;
        for (String each : times){
            if (each == "java"){
                count++;
            }
        }
        System.out.println(count);
    }
}
