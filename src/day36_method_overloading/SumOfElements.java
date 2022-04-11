package day36_method_overloading;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(sum(arr));
        System.out.println(sum(1,4,67756,3));
    }

    /*public static int sum(int[] nums){
        int sum = 0;
        for (int each : nums){
            sum += each;
        }
        return sum;
    }*/

    // the variable ... is args.  It allows you to work with an array without calling out the array on a separate line. See above
    public static int sum(int ... nums){

        int sum = 0;
        for (int each : nums){
            sum += each;
        }
        return sum;
    }
}
