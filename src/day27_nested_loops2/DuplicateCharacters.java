package day27_nested_loops2;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /*
    [IQ] Duplicate characters

Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		ACE

	-> the characters A C and E are found in the String multiple times, so they are duplicates

	This is the opposite of unique

     */

        String str = "aaabccdeef";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            if (checked.contains("" + str.charAt(i))){
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            if (count > 1){
                System.out.print(str.charAt(i));
            }

        }
    }

}
