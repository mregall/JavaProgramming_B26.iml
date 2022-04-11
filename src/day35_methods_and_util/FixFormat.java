package day35_methods_and_util;

public class FixFormat {
     /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
    Input:
        jamES

    Output:
        James

     */

    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}

