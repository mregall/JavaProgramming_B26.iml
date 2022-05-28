package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        //keys are integer, and values are String

        Map<Integer, String> map = new HashMap<>();
        //no map.add in maps
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map);
        //element order is random.  not sorted.

        //read the key/value from map
        System.out.println(map.get(1));

        String value = map.get(5);
        System.out.println(value);

        map.remove(1); // remove method argument is the key, it removes the whole entry
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world"); // null key exists, so the value gets updates to hello world
        System.out.println(map);

        map.put(3, "March"); // 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);



    }
}
