package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L, "James", 1000000);
        System.out.println(obj1);

        System.out.println("============ 2 =================");
        DebitCard obj2 = new DebitCard(123456789111L, "Ben", 1000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        // valid values
        System.out.println("=========== 3 - valid ===============");
        DebitCard obj3 = new DebitCard(1234567891112141L, "James", "Visa", 7000, 10000000);
        System.out.println(obj3);

        // invalid values
        System.out.println("=========== 4 - invalid =============");
        DebitCard obj4 = new DebitCard(1234567891L, "James", "Money", 7, 123456);
        System.out.println(obj4);
    }
}
