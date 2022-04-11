package day39_arraylist2;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);

        Integer i = 500;
        //we can't use nums.remove(500); because it will think 500 is an index

        nums.remove(i);
        System.out.println(nums);

        nums.remove(Integer.valueOf(200));
        System.out.println(nums);
    }
}
