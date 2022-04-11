package additional_practice;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;





        System.out.println(a); //at this point the operation in 'b' will have added the one to 'a'
        System.out.println(b); //but 'b' is 5 until something else happens.


        int c = b + a;

        System.out.println(c);

    }
}
