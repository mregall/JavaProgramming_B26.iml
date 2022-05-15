package day58_exceptions.morning;

public class PersonObjects {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setAge(50);
        try {
            obj.setName("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("obj.getName() = " + obj.getName());
        System.out.println("obj.getAge() = " + obj.getAge());
    }
}
