package additional_practice;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chr = input.next();

        int lCount = 0;
        int uCount = 0;
        int numCount = 0;

        for (int i = 0;i < chr.length();i ++) {
            if (chr.charAt(i) >= 'a' && chr.charAt(i) <= 'z'){
                lCount++;
            }
            if (chr.charAt(i) >= 'A' && chr.charAt(i) <= 'Z'){
                uCount++;
            }
            if (chr.charAt(i) >= '0' && chr.charAt(i) <= '9') {
                numCount++;


            }} System.out.println(lCount + " " + uCount + " " + numCount);
    }
}
