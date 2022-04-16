package day47_encapsulation;

public class AccessInPackage {
    public static void main(String[] args) {


        AccessModifierExCode obj = new AccessModifierExCode();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(obj.c);

        System.out.println(AccessModifierExCode.x);
        System.out.println(AccessModifierExCode.y);
        //System.out.println(AccessModifierExCode.z);

        //c and z were not accessible outside the class due to private
    }
}
