package day22_loops;

public class Letters {
    public static void main(String[] args) {
        // a - z lowercase

        char lowerCaseUp = 'a';

        while(lowerCaseUp <= 'z') {

            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }

        char upperCaseBack = 'Z';

        while(upperCaseBack >= 'A'){
            System.out.print(upperCaseBack + " ");
            upperCaseBack--;
        }


    }
}
