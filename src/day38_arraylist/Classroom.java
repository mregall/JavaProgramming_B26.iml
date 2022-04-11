package day38_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());
        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Neli");
        System.out.println(group);
        System.out.println(group.size());

        System.out.println("group.get(0) = " + group.get(0));

        //Arraylist for i loop

        for (int i = 0; i < group.size(); i++) {
            System.out.println("Student " + (i+1) + " " + group.get(i));
        }

        //Arraylist foreach loop

        for (String student : group){ // student == group.get(i)
            System.out.println("Student " + student);

        }
    }
}
