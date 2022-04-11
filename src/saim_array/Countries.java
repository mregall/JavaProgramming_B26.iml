package saim_array;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        /*
        Countries
Given a String array of countries:
String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
"Albania", "Portugal", "Philippines", "Armenia", "Colombia",
"Honduras", "Indonesia", "United States"
};
- Find and print all the first and last characters of each country
- Find and print all the countries that end with the letter ‘a’
- Create “contains logic” to check if there is a certain country in the array. Can check for
the United States, or use Scanner to check any country

         */
        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        String endsA = "";

        for (int i = 0; i < countries.length; i++) {
            System.out.print("" + countries[i].charAt(0) + countries[i].charAt(countries[i].length()-1) + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].endsWith("a")){
                endsA += countries[i] + " ";
            }
        }
        System.out.println(endsA);

    }
}
