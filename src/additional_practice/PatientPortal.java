package additional_practice;
import java.util.Scanner;
public class PatientPortal {
    /*
    Declare nine String variables: firstName, lastName, email, street, state, city

Declare two int variables: age, zipCode

Declare two double variables: height, weight

Declare a boolean variable: isMarried

Declare two long variables: workPhoneNumber ,personalPhoneNumber

Create a Scanner object named scan

Your program flow should go like this:
Note: anything indented is an input value from the console
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
     */


    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, email, street, state, city;
        int age, zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;

        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        city = scan.next();
        System.out.println("Enter your state");
        state = scan.next();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextInt();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextInt();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        String contact = workPhoneNumber + ", " + personalPhoneNumber + ", " + email;
        String fullName = firstName + " " + lastName;
        String address = street + ", " + city + ", " + state + ", " + zipcode;

        System.out.println("Patent personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contact: work phone number: " + workPhoneNumber + ", personal phone number: " + personalPhoneNumber + ", email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married: " + isMarried);


    }
}
