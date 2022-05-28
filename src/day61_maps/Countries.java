package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> countries = new HashMap<>();

        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "New York", "Dallas", "DC", "Denver", "LA")));

        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir")));

        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));

        System.out.println(countries);

        //print all cities that start with d or i

        for (ArrayList<String> cities : countries.values()){
            //outer loop goes through the values of the map

            for (String eachCity : cities){
                //inner loop iterates through each city in Arraylist value

                if (eachCity.startsWith("D") || eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }
            }
        }

        System.out.println("============================");
        System.out.println("What country do you want to tour?");
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();

        for (String cities : countries.get(country)){
            System.out.println("Touring..." + cities);
        }


    }
}
