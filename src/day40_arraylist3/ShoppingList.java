package day40_arraylist3;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "Shopping List Empty" : "You have some Items") ;
        String keepAsking;//we don't need the "" because the do/while guarantees a value.
        //Saim used a do/while loop and the book used a while !done logic.

        do {
            System.out.println("Enter the item ");
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue ? ");
            keepAsking = input.nextLine();
        } while (keepAsking.equals("yes") || keepAsking.equals("y"));

        System.out.println("Shopping List:");
        for (String item: shoppingList){
            System.out.println("*\t" + item);
        }
        System.out.println("====================================================");

        System.out.println(shoppingList.contains("water") ? "Water on list" : "No water on the list");

        System.out.println("Do you want to remove any items?");
        if (input.nextLine().equals("yes")){
            System.out.println("What item do you want to remove?");
            String removeItem = input.nextLine();//Item or item number

            if (Character.isDigit(removeItem.charAt(0))){
                int number = Integer.parseInt(removeItem);
                shoppingList.remove(number-1);
            }else{
                shoppingList.remove(removeItem);
            }
        }
        System.out.println("Final list: " + shoppingList);

        System.out.println("==============================================");


        ArrayList<String> toDoList = new ArrayList<String>();
        System.out.println("Enter items for the list, when prompted.");
        boolean done = false; // using this sets up everything other than yes to be a no automatically.
        Scanner keyboard = new Scanner(System.in);
        while (!done)
        {
            System.out.println("Type an entry:");
            String entry = keyboard.nextLine( );
            toDoList.add(entry);
            System.out.print("More items for the list? ");
            String ans = keyboard.nextLine( );
            if (!ans.equalsIgnoreCase("yes"))
                done = true;
        }
        System.out.println("The list contains:");
        int listSize = toDoList.size( );
        for (int position = 0; position < listSize;
             position++)
            System.out.println(toDoList.get(position));


    }
}
