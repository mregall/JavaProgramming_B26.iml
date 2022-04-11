package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                if (i*j < 10 )
                System.out.print(" " + i*j + " ");
                else {
                    System.out.print(i*j + " ");
                }
            }
                System.out.println();
        }
    }
    }

