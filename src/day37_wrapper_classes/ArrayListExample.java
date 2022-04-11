package day37_wrapper_classes;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers);
        numbers.add(100);
        System.out.println(numbers);
        numbers.add(80085);
        numbers.add(-40);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size()-1);

    }
}
