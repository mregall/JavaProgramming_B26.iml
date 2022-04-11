package day03_escape_char_comments;

public class QuotesEscapes {
    public static void main(String[] args) {
        /*
        How can I output

        I like "java" programming?



        Use an escape sequence. ie. backslash \ before the character I want to use that's also used in syntax.

         */
        long miles = 9999999;

        System.out.println("I like \"java\" programming.");

        // You need a backslash for each character you want to escape.
        // Therefore there will always be sets of 2 in orange.

        /*
        Useful escape characters:

        \" = "
        \\ = \
        \' = '
        \n = next line
        \t = tab
         */
        System.out.println(miles);

    }
}
