package day07_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("2 cars drive into the parking lot");
        //approach 1

        cars = cars +2;
        System.out.println(cars);

        System.out.println("2 more cars roll in.  What to do?");
        //approach 2

        cars++;
        cars++;
        System.out.println(cars);

        // when there's no other code, the ++ runs right away.  ???

        char x = 76;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);



        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);

        /*
        output : LMNO OPQR

        Notice that the difference between x++; sout ; and sout(x++)


         */








    }

}
