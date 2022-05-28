package day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank account1 = new Bank();
        account1.balance = 1000;
        account1.withdraw(500);
        System.out.println(account1.balance);

        try {
            account1.login("jamesbond", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.login("james", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.login("jamesbond", "07");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

    }
}
