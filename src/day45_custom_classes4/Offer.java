package day45_custom_classes4;

public class Offer {
    /*
        create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int daysPTO;

    /*
        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    */

    public Offer(String location, String company) {
        this.company = company;
        this.location = location;
    }

    public Offer(String location, String company, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int daysPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.daysPTO = daysPTO;
    }

    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", daysPTO=" + daysPTO +
                '}' + "\n";
    }
}

