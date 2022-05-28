package additional_practice;

import java.text.NumberFormat;

public class Mosh {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String money = percent.format(.2);
        System.out.println(money);


    }
}
