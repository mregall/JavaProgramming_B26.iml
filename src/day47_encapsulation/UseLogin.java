package day47_encapsulation;

public class UseLogin {

    public static void main(String[] args) {

        Login obj = new Login();
        //obj.username = "jamesbond";
        //obj.password = "1234";
        //since we made these instance variables private we can't do it this way

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

        //System.out.println(obj.username);
        //System.out.println(obj.password);
        //these don't work, we can't access directly anymore

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

    }

}
