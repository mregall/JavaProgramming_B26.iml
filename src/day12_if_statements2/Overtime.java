package day12_if_statements2;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 160;
        double numberOfHours = 40;
        double netPay;

        if(numberOfHours > 40) {

            double overtimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overtimeHours * hourlyRate * 1.5;

        } else {
            netPay = numberOfHours * hourlyRate;

        }

        System.out.println(netPay);



    }
}
