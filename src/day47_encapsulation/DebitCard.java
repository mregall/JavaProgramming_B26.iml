package day47_encapsulation;

public class DebitCard {
     /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type

        */
    //instance variable
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    //static variables
    static String accountType;

    static {
        accountType = "Checking";
        //could add methods here or print statements, etc.
    }

    /*

    Create a constructor that will create a debit card object and initialize the card number, the cardholder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also, the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    */

    //constructors
    public DebitCard(long cardNumber, String holderName, double balance){
        this.holderName = holderName;
        this.balance = balance;
        //verifying that length of the card number
        if (String.valueOf(cardNumber).length() == 16){
            this.cardNumber = cardNumber;
        }else{
            System.err.println("Invalid card number");;
        }
    }

    //this() is used to chain constructors
    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);
        if(cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")){
            this.cardType = cardType;
        } else {
            System.err.println("Invalid Card type - Must be Visa or Mastercard");
        }

        if(String.valueOf(pin).length() == 4){
            this.pin = pin;
        } else {
            System.err.println("Invalid Pin - Must be 4 digits");
        }

    }

    /*

    Add the toString method that will print all the cards' information (Except the pin). If the card type does not have a value do not print that line.

     */

    //toString
    public String toString(){
        String info = "Holder Name: " + holderName;
        if (cardNumber !=0){
            info += "\nCard Number: " + cardNumber;
        }

        if (cardType != null){
            info += "\nCard Type: " + cardType;
        }

        info += "\nBalance: " + balance;

        return info;
    }
}










































