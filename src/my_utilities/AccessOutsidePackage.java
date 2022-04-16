package my_utilities;

import day47_encapsulation.AccessModifierExCode;

public class AccessOutsidePackage {

    //new class in a different package

    public static void main(String[] args) {
        AccessModifierExCode obj = new AccessModifierExCode();
        System.out.println(obj.a);
        //System.out.println(obj.b);
        //System.out.println(obj.c);

        System.out.println(AccessModifierExCode.x);
        //System.out.println(AccessModifierExCode.y);
        //System.out.println(AccessModifierExCode.z);

        //c and z are private, and remain inaccessible

        //b and y are default variables, only usable in the package
    }
}
