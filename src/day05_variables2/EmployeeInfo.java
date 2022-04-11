package day05_variables2;

public class EmployeeInfo {
    public static void main(String[] args) {

        // declare and assign these variables:
        //        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

    String firstName, lastName, companyName, jobTitle;
    char gender, suite;
    int age, numberOfPTO;
    double salary;
    boolean isFullTime, isMarried;

    //see how you can put together all the variables of a single type together.

    firstName = "Mike";
    lastName = "Regall";
    companyName = "Ten Mile";
    jobTitle = "Inventor";
    gender = 'M';
    suite = 'D';
    age = 43;
    numberOfPTO = 365;
    salary = 1_000_000;
    isFullTime = true;
    isMarried = false;


        String fullDetails = "Employment information for " + firstName + " " + lastName + ",\n" + jobTitle + " at " + companyName + ", currently " + age + " years old.\n" + companyName + " is located in suite " + suite + ". This year's salary comes to $" + salary + ".\n Other details include, PTO: " + numberOfPTO + ", full time? " +isFullTime + ", married? " + isMarried;

        System.out.println(fullDetails);









    }
}
