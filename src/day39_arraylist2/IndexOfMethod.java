package day39_arraylist2;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        System.out.println(nums.indexOf(100));//calls the first index of. --> 0

        System.out.println(nums.indexOf(700));//not an index --> -1

        int i = nums.indexOf(200);
        System.out.println(i);// index == 1

        System.out.println(nums.lastIndexOf(100));//last index of --> 4
    }
}
