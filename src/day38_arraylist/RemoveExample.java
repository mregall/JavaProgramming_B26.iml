package day38_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.remove(list.size()-1));
        //removes the last line and prints it in this case
        System.out.println(list);

        System.out.println(list.remove(1));

        System.out.println(list.remove("apple")); // false because this doesn't exist in the arraylist
    }
}
