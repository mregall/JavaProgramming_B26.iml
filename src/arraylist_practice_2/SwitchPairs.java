package arraylist_practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    /*
    Switch Pairs
        Given an ArrayList of words switch position for
        each pair in the List. A pair is an element and
        the element next to it.
        The given ArrayList will always have an even
        number of elements so each element will
        always have a single pair.

        Ex:
        Input: {"Cat", "in", "the", "hat"}
        There is two pairs:
        "Cat" and "in"
        "the" and "hat"
        Output: {"in", "Cat", "hat", "the”}

        if % 2 == 0 --> this gets you every other one.  Then just add the pair after that.
        if % 2 == 1 --> same thing gets you odds.
     */
    public static void main(String[] args) {
        ArrayList<String> flip = new ArrayList<String>(Arrays.asList("Cat", "in", "the", "hat"));
        ArrayList<String> output = new ArrayList<> ();
        for(int i = 0 ; i < flip.size() - 1 ; i++){
            if(i % 2 == 0){

                output.add(flip.get(i+1));
                output.add(flip.get(i));
            }
        }
        System.out.println(output);
    }
}
