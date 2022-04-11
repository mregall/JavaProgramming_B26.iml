package day32_multidimensional_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String [4][];
        //first one is how many arrays do you have
        //String [][] cydeo = new String[4][3]; this would be 4 arrays of size 3
        //you don't have to give the size of the second one, but you can.
        System.out.println(Arrays.toString(cydeo)); //[null, null, null, null]

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Add the next group");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding group 3");
        cydeo[2] = new String[]{"Mustafa", "Lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Group 3 == Group 4");
        cydeo[3] = cydeo[2];
        //you could also use Arrays.copyOf();
        System.out.println(Arrays.deepToString(cydeo));

        for (String [] innerArray : cydeo){
            for (String eachWord: innerArray){
                System.out.println(eachWord);
            }
        }
    }
}
