package arraylist_practice_2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    /*
    Separate Parts
        Write a program that can extract the special characters, digits and letters
        from a string and stores them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String mess = "ABCDEFX123$%#@&456EFG!";
        ArrayList<String> split = new ArrayList<>(Arrays.asList(mess.split("")));
        System.out.println(split);

        ArrayList<String> numbers = new ArrayList<>(split);
        numbers.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println(numbers);

        ArrayList<String> special = new ArrayList<>(split);
        special.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "~", "`"));
        System.out.println(special);

        ArrayList<String> alpha = new ArrayList<>(split);
        alpha.removeAll(numbers);
        alpha.removeAll(special);
        System.out.println(alpha);

        //This last one is interesting.

    }
}
