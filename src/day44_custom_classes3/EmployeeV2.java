package day44_custom_classes3;

public class EmployeeV2 {

     /*
       create a class called Employee

        - data:

            name, id, job title, salary

            */

    String name;
    int id;
    String jobTitle;
    double salary;

        /*

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        */

    public EmployeeV2(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, int id, String jobTitle, double salary) {
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }

    /*
        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

     */

    public void goToMeeting() {
        System.out.println(name + " is going to a meeting");
    }

    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }

}

