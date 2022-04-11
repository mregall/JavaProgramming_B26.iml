package day15_switch_statements;

public class Browser {
    public static void main(String[] args) {

        String browser = "Chrome";
        String url = "www.google.com";

        switch (browser){

            case "chrome": //you can have an empty case and until the break, they
                //group together.
            case "Chrome":
                System.out.println("Opening " + url + " in the chrome browser");
                System.out.println("Loading...");
                break;

            case "Safari":
                System.out.println("Opening " + url + " in safari browser");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in firefox");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }


    }
}
