package day20_string4;

public class SmsParts {
    public static void main(String[] args) {
         /*
        [SMS parts]
        Given a String in the following format:
        “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
        Separate these parts and print them separately: Sender: actualSender
        Number: actualNumber Message: actualMessage”
         */
        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf(">");

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnd = msg.indexOf('}');

        System.out.println("Sender: " + msg.substring(senderStart +1, senderEnd));
        System.out.println("Sender Number: " + msg.substring(numberStart +1, numberEnd));
        System.out.println("Message: " + msg.substring(msgStart +1, msgEnd));

        /*
        Using Replace
         */

        String str = "today is monday";
        str = str.replace(" ", ""); //removes all the spaces
        System.out.println(str);

        String str2 = "today is tuesday";
        str2 = str2.replace("tuesday", "wednesday");
        System.out.println(str2);

    }
}
