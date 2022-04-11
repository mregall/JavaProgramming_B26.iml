package day07_unary_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 15 ;
        double stateTaxRate = 0.137; // when doing a percentage, we can only do the decimals in java
        double federalTaxRate = 0.0766;
        double stateTax, federalTax, totalTax, salaryAfterTax, monthlySalary;
        int rent = 650, electric = 115, phone = 110, food = 440;
        int bills = rent+electric+phone+food;


        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        monthlySalary = salaryAfterTax * 160;
        int disposable = (int) (monthlySalary-bills);

        System.out.println();

        String taxReport = "Base salary: $" + salary + " per hour, state tax rate: " + stateTaxRate + ", Federal tax rate: " + federalTaxRate + "\nTax amounts: " + stateTax + " for state tax and " + federalTax + " for federal tax, coming to a total of " + totalTax + "\nAfter tax your salary is $" + (salaryAfterTax);


        System.out.println();


        System.out.println(taxReport);
        System.out.println();

        System.out.println("Working a 40 hour week you will take home $" + (salaryAfterTax*40) + " or about $" + monthlySalary + " per month." );

        System.out.println("Lowest average bills for rent, electric, phone, and food is $" + bills + " per month.  \nLeaving you with $" + disposable + " per month for transportation, clothing, furniture, insurance, savings, and enjoyment.");

        System.out.println();












    }
}
