package day35_methods_and_util;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));
        System.out.println(StringUtil.fixFormat("jAmeS"));
        System.out.println(StringUtil.frequencyOfChar("apple", 'p'));
        System.out.println(StringUtil.uniqueChar("apple"));

    }
}
