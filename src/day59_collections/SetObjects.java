package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        //HashSets have no order, no index, and no duplicates
        //to interact with them you use a loop

        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("Hello");
        set.add("$4.5");
        set.add("400");
        set.add("Hello");
        set.add("%");
        System.out.println(set);

        //LinkedHashSet maintains the order.  Only difference
        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("Hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("Hello");
        set2.add("%");
        System.out.println(set2);

        //TreeSet uses ASCII to organize the data
        Set<String> set3 = new TreeSet<>();
        //set3.add(null); null is not allowed.
        set3.add("Hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("Hello");
        set3.add("%");
        System.out.println(set3);


    }
}
