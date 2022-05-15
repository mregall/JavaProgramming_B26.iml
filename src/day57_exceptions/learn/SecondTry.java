package day57_exceptions.learn;

public class SecondTry {
    public static void main(String[] args) {

        try{
            //String s = null;
            String s = "java";
            System.out.println(s.length());

            int[]a={1,2,3,4};
            System.out.println(a[10]);
        }catch (NullPointerException e){
            System.out.println("Caught NPE");

        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Caught AOB");
        }


    }
}
