package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        // All objects will be of the javatextbook
        // Itself first

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 222;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programming";
        book2.size = 222;
        //book2.fun = true;


        ((JavaTextbook)book2).fun = true; //casting the Ebook to a JavaTextBook on this line only.


        //we cast the reference from the parent to the child
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextbook();
        book3.name = "Java Programming";
        //book3.size = 222;
        //book3.fun = true;
        book3.read();
        //book3.open();
        //book3.download();

        Downloadable book4 = new JavaTextbook();
        /*book4.name = "Java Programming";
        book4.size = 222;
        book4.fun = true;
        book4.read();
        book4.open();*/
        book4.download();

        if (book4 instanceof JavaTextbook){
            System.out.println("true");

        }else{
            System.out.println("false");
        }

        JavaTextbook book5 = (JavaTextbook) book4; //casting Downloadable book4 to a new object named book5.  Reusable because its a new object.

    }
}
