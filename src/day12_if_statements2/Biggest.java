package day12_if_statements2;

public class Biggest {
    public static void main(String[] args) {
        int num1, num2, num3;

        num1 = 4;
        num2 = 6;
        num3 = 2345;

        if(num1>num2 && num1>num3) System.out.println(num1);
        else if (num2>num1 && num2>num3) System.out.println(num2);
        else System.out.println(num3);
    }
}
