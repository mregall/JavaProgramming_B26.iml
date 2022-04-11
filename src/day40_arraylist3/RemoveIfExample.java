package day40_arraylist3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,5,6,7,12,56,44,843,4,56));

        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf(n -> n % 2 == 0); //n is a variable to define every element
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf(each -> each > 10); //n is a variable to define every element
        System.out.println(nums2);

        ArrayList<String> days = ArraylistWithMethods.getDaysOfWeek();
        days.removeIf(day -> day.startsWith("S") || day.startsWith("T"));
        System.out.println(days);


    }
}
