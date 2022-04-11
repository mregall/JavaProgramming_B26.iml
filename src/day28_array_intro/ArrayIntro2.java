package day28_array_intro;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4];

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        //how do we change the null values in the array

        arr[0] = 4.5;

        System.out.println(Arrays.toString(arr));

        arr[1] = 12.5;
        arr[2]= 34;
        arr[3]=23.5;
        System.out.println(Arrays.toString(arr));

        //reassigning an element
        arr[2]=2000;
        System.out.println(Arrays.toString(arr));

        //create a new array with five elements. Resets all the elements to null
        arr = new double[5];
        System.out.println(Arrays.toString(arr));

        //An array is an object.  The name of objects is "reference"
    }
}
