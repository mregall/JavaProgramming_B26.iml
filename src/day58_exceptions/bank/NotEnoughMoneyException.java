package day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super("Not Enough Money in the Account");
    }


}
