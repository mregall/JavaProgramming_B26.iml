package day47_encapsulation;

public class AccessModifierExCode {
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;

    //in same class:

    public static void main(String[] args) {
        AccessModifierExCode obj = new AccessModifierExCode();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(AccessModifierExCode.x);
        System.out.println(AccessModifierExCode.y);
        System.out.println(AccessModifierExCode.z);

        //since we're in the same class we're able to access everything
    }
}
