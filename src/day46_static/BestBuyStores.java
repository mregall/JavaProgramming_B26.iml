package day46_static;

public class BestBuyStores {
    public static void main(String[] args) {
        // access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputers);
        System.out.println("=====================================\n");

        BestBuy store1 = new BestBuy("Menomonee Falls");
        System.out.println(store1.location);
        //access that instance variable

        System.out.println(store1.numberOfComputers);
        // it doesn't like this because the computers are shared among all stores
        store1.numberOfComputers --;
        System.out.println(BestBuy.numberOfComputers);

        System.out.println("=====================================\n");

        BestBuy store2 = new BestBuy("Main St");
        System.out.println(store2.location);

        store2.numberOfComputers -= 5;

        System.out.println(store1.numberOfComputers);
        System.out.println(BestBuy.numberOfComputers);

        store2.location = "Fairfax";
        System.out.println(store1.location);
        System.out.println(store2.location);

        System.out.println("=====================================\n");

        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComputers);
        store1.reStock();
        System.out.println(BestBuy.numberOfComputers);

        // BestBuy.openStore()

        store1.openStore();
        store2.openStore();


    }


}
