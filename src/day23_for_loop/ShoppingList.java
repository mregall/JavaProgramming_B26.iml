package day23_for_loop;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore;

        do {
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine();

            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();

        } while (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y"));

        System.out.println(list);
    }
}
