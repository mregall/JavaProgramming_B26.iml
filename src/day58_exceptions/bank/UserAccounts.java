package day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank account1 = new Bank();
        account1.balance = 1000;
        account1.withdraw(500);
        System.out.println(account1.balance);

    }
}
