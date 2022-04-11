package day38_arraylist;

import java.util.Arrays;

public class HtmlGenerator {
    /*
    HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString("li^3".split("\\^")));
        System.out.println(htmlGenerate("li^3"));
    }

    public static String htmlGenerate(String str){

        String html = "";
        String [] parts = str.split("\\^"); //could also use str.replace("^", " ").split(" ");

        int repeat = Integer.parseInt(parts[1]);
        for (int i = 0; i < repeat; i++) {
            html += "<" + parts[0] + ">" + "</" + parts[0] + "> ";
        }

        return html;
    }
}
