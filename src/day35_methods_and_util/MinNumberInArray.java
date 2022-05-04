package day35_methods_and_util;

public class MinNumberInArray {
    //find the smallest number

    public static int minNumber(int[] nums){
        //Arrays.sort(nums);return nums[0];
        int min = nums[0];

        for (int num : nums){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,3,5};
        int min = minNumber(arr);
    }
}
