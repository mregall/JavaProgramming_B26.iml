package day39_arraylist2;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums.contains(200)); //boolean
        //true
        System.out.println(nums.contains(700));
        //false
    }
}
