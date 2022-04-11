package additional_practice;

public class CbNotString {
    /*
    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

        notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"

        First Try:
         String newStr = "not " + str;

        if (newStr.substring(4, 6).equals(str.substring(0, 3))) {
            return str;
        }
        return newStr;
        }

     */
    public static void main(String[] args) {

    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }



}
