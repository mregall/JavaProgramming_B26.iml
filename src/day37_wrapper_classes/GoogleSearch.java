package day37_wrapper_classes;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 2,550,000,000 results (1.00 seconds)"; //number too big for int.
        String [] arr = result.split(" ");

        String resultStr = arr[1].replace(",", "");
        String timeStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timeStr);

        System.out.println(Integer.MAX_VALUE);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timeStr);

        if (resultNumber >= 0){
            System.out.println("Test case Passed - Positive Number");
        }else{
            System.out.println("Failed");
        }

        if (timeNumber <= 2 && timeNumber >= 0){
            System.out.println("Test case Passed - Under 2 seconds");
        }else{
            System.out.println("Failed");
        }
    }
}
