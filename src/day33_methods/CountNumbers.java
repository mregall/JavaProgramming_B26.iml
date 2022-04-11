package day33_methods;

import javax.imageio.stream.ImageInputStream;

public class CountNumbers {
    /*
    count to a certain number.  method(10) for example

     */
    public static void countTo(int givenNumber){
        for (int i = 0; i <= givenNumber; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        countTo(9);
    }
}
