package day28_array_intro;
import java.util.Scanner;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad"};

        //do we have jackets?

        String element = "";
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")){
                inStock = true;
                break;
            }

        }
        System.out.println(inStock ? "Jackets in stock" : "Jackets out of stock");//ternary
        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket"));//full string manipulation

        /* My first try below...
        for (int i = 0; i < items.length; i++) {

            element = items[i];
            if (element == "Jacket"){
                inStock = true;

            }
                System.out.println(inStock);
            }*/

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String lookingFor = input.nextLine();
        boolean inInventory = false;

        for(int i = 0; i < items.length; i++){

            if(items[i].equalsIgnoreCase(lookingFor)){
                inInventory = true;
                break;
            }

        }

        System.out.println(lookingFor + (inInventory ? " in stock" : " out of stock"));
        }

    }

