package day31_Arrays_methods;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = b;

        System.out.println(a == b); //this doesn't work, they have the same elements but are different objects
        System.out.println(b == c); //this is two names for the same object

        System.out.println("======================================");

        System.out.println(Arrays.equals(a,b));
        //this is comparing what is in the elements {1,2,3}


    }
}
