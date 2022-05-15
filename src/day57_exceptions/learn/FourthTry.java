package day57_exceptions.learn;

public class FourthTry {
    public static void main(String[] args) {


            try {
                System.out.println("Start");
                Thread.sleep(2000);
                System.out.println("Finish");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
