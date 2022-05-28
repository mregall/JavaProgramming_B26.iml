package day58_exceptions.bank;

public class InvalidCredentialsException extends Exception{

    public InvalidCredentialsException(String msg){
        super(msg);
    }
}
