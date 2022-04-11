package day27_nested_loops2;

public class ContinueInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("I" + i);

            for (int j = 0; j < 3; j++) {
                if (j == 1){
                    continue;//we're skipping before printing J1
                }
                System.out.println("\tJ " + j);
                
                for (int k = 32; k > 4; k--) {

                }
                }


                }
            }

        }


