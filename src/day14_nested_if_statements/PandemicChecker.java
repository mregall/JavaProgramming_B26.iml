package day14_nested_if_statements;
import java.util.Scanner;
public class PandemicChecker
{
    public static void main(String[] args) {
        /*
        Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.

    Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Any year not in those ranges: No Pandemic
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year:");
        int year = input.nextInt();


        String pandemic;

        if(year >= 1346 && year <=1353){
            pandemic = "The Black Death";
        } else if (year >= 1665 && year <=1666)
            pandemic = "Great Plague of London";
        else if (year >= 1770 && year <=1772)
            pandemic = "Russian Plague";
        else if (year >= 1889 && year <=1890)
            pandemic = "Flu Pandemic";
        else if (year == 1916 )
            pandemic = "American Polio Epidemic";
        else if (year >= 1918 && year <=1920)
            pandemic = "Spanish Flu";
        else if (year >= 2009 && year <=2010)
            pandemic = "H1N1 Swine Flu Pandemic";
        else if (year >= 2014 && year <=2016)
            pandemic = "West African Ebola Epidemic";
        else if (year >= 2020 && year <=2022)
            pandemic = "COVID-19";
        else
            pandemic = "No Pandemic";

        System.out.println("pandemic = " + pandemic);


    }
}
