package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    //find the smallest element
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
    //find the largest element
    public static int maxNumber(int[] nums){
        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    //does it contain this element
    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {

            if (each == element) {
                return true;
            }
        }
        return false;
    }
    public static int indexOf(int[] nums, int element){
        //here we're asking where the number is that we're looking for.
        //not what is at index i
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(String [] strs, String element){
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public static int [] addElement(int [] original, int elementToAdd){
        int [] newArray = new int[original.length + 1];

        for(int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        // Instead of doing a loop ourselves, we could have used Arrays.copyOf()
        newArray[newArray.length - 1] = elementToAdd; // adding the new element to the end of the new array
        return newArray;
    }

    public static String [] addElement(String [] original, String element){

        return null;
    }

    public static int [] addElement(int [] original, int [] elementsToAdd){

        int [] newArray = new int[original.length + elementsToAdd.length];

        for(int i = 0, j = 0; i < newArray.length; i++){

            if(i < original.length){
                // added the elements from the original array in the new array
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }

        return newArray;
    }


}
