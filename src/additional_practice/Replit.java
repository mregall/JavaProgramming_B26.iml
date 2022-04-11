package additional_practice;
import java.util.Locale;
import java.util.Scanner;
public class Replit {
    public static void main(String[] args) {
       int year = 1;
       int growth = 1;
       int two = 2;
       int size = 1;

       /*
       while(year <= 10){
           if(year <=3){
               System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + size + " cm");

               year += 1;
               size += 1;
           }else {
               System.out.println("year " + year + " - growth " + two + " cm\ntree size: " + size + " cm");
               year += 1;
               size += 2;
           }*/

          while(year <= 3){
           System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + size + " cm");

           year += 1;
           size += 1;

       }size +=1;
        while(year <= 10) {
            System.out.println("year " + year + " - growth " + two + " cm\ntree size: " + size + " cm");
            year += 1;
            size += 2;
        }












    }
}
