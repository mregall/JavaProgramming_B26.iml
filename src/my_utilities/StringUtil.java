package my_utilities;

public class StringUtil {
    /*
    reverse
    create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

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

    /*
    Frequency of Character

    create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
     */

    public static int frequencyOfChar(String str, char letter){
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count ++;
            }
        }
        return count;
    }

    public static String uniqueChar(String str) {

        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains("" + str.charAt(i))) {

                int count = StringUtil.frequencyOfChar(str, str.charAt(i));

                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
        }
        return unique;
    }
}

