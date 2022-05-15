package day55_polymorphism.clothes;

public class ClothingStore {
    public static void main(String[] args) {
        //make all references to t-shirt

        TShirt shirt1 = new TShirt();
        shirt1.wear();

        Clothes shirt2 = new TShirt();
        shirt2.wear();

        Object shirt3 = new TShirt();
        //this can't use any methods, it doesn't know them

        System.out.println("===================");

        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //jacket2.putOnHood;

        Object jacket3 = new Jacket();

        HasHood jacket4 = new Jacket();
        jacket4.putOnHood();


    }
}
