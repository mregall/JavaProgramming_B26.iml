package day39_arraylist2;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.set(0,-100);//enter the position, then the new value. Replaces the old value
        System.out.println(nums);

    }
}
