package day29_array;

public class Store {
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 199.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        //print our inventory list

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }
        System.out.println("-------------------------------");

        //find the index of the gloves

        int indexOfGloves = -1;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
                indexOfGloves = i;
                break;
            }
        }
        System.out.println("Index of gloves " + indexOfGloves);

        System.out.println("-------------------------------");

        //find all data for the most expensive item.

        double expensive = prices[0];
        int indexOfExpensive = 0;



        for (int i = 0; i < prices.length; i++) {
            double cost = prices[i];
            if (cost > expensive){
                expensive = cost;
                indexOfExpensive = i;

            }

        }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfExpensive]);
        System.out.println("Price $" + prices[indexOfExpensive]);

   }
}
