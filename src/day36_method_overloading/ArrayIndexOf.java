package day36_method_overloading;

public class ArrayIndexOf {

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

    public static void main(String[] args) {
        int [] arr = {12,45,212,5,7,5,90};
        String [] words = {"java", "class", "overloading", "methods", "hello"};

        System.out.println(indexOf(arr, 45));
        System.out.println(indexOf(words, "hello"));

    }
}
