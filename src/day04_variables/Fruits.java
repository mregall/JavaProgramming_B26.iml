package day04_variables;

public class Fruits {
        public static void main(String[] args) {
                int apples = 50;
                int grapes = 100;
                int bananas = 150;

                System.out.println("This is how many apples we have: " + apples);
                System.out.println("Grapes: " + grapes);
                System.out.println("Bananas: " + bananas);

                System.out.println("sold some apples");
                        apples = 25;
                System.out.println("Apples after selling: " + apples);

//                Concatenation --> using a "+" operator to add variables to lines of text

                int price = 15;

                System.out.println("The price of my " + apples + " apples is $" + price);

        }
        }
