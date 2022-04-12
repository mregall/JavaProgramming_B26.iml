package day37_wrapper_classes;

import java.util.ArrayList;

public class ExampleCode {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(i);
        System.out.println(li);
    }
}
