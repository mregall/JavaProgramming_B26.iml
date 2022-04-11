package additional_practice;

public class Employee {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle, office;
        int salary, startDay, startMonth, startYear;
        boolean fullTime;

        firstName = "Noah";
        lastName = "Smith";
        companyName = "Apple";
        salary = 200_000;
        startDay = 10;
        startMonth = 1;
        startYear = 2022;
        fullTime = true;
        jobTitle = "SDET";
        office = "One Apple Park Way, Cupertino, CA 95014";

        String fullName = (firstName + " " + lastName);
        String fullStartDate = (startMonth + "/" + startDay + "/" + startYear);
        String email = (firstName + startDay + "@" + companyName + ".com");
        double salaryPlusTwo = (salary * 1.15);

        System.out.println("Employee Information\nWe have " + fullName + " joining " + companyName);
        System.out.println(firstName + " will start on " + fullStartDate + " as full time: " + fullTime);
        System.out.println(firstName + " here is some information about your employment");
        System.out.println("Your email is " + email);
        System.out.println("Your base salary is $" + salary + " and after 2 years it will be $" + salaryPlusTwo);
        System.out.println("Welcome aboard, see you at " + office);


        /* Employee Information
        We have FULL_NAME joining COMPANY_NAME
        FIRST_NAME will start on FULL_START_DATE as full time: IS_FULL_TIME
        FIRST_NAME here is some information about your employment
        Your email is EMAIL
        Your base salary is $SALARY and after 2 years it will be $SALARY_2_YEARS
        Welcome aboard, see you at ADDRESS
*/
    }
}
