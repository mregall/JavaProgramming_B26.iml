package day48_encapsulation2.static_imports;

import java.util.Arrays;
import static java.util.Arrays.*;
//this second one with "static" means we're importing all the methods, so we don't need Arrays.sort(a) just sort(a);
//anywhere we'd write Arrays now we don't need to put it anymore.

//other classes
import static java.lang.Math.*;
import static my_utilities.StringUtil.*;

public class WithImport {
    public static void main(String[] args) {
        int [] a = {4,12,5,25};

        Arrays.sort(a);
        sort(a);
        System.out.println(PI);
        System.out.println(reverse("Apple"));
    }
}
