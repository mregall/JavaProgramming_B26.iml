package day37_wrapper_classes;

public class Day37Notes {
    /*
    3/27/2022

Day 37 Wrapper class and ArrayList

day37__wrapper_arraylist
____________________________________________________________

Wrapper class
ArrayList
____________________________________________________________

Overloading:

    being able to create a method that has the same name as another method, but it has different parameters (different types or different number of parameters, order)

    are able to make a set of methods that do something similar, but the internal code and the input information can be slightly different

    --> it is easier to remember/ use 1 or 2 method names instead of 3 or 4 --> re-usable and readable

    Q: Can you overload by changing only the return type

        no, overloading happens when there is different parameters


        -> but, if a method is overloaded then it possible to change the return type

    Ex:

        public static int [] sum(int [] arr, int [] arr2){
            // code
        }

        public static double [] sum(double [] arr, double [] arr2){

        }


        invalid:

        public static String [] sum(int [] arr, int [] arr2){

        }

        above is invalid because the parameters and name of the method are the same as the first one, but the return was changed --> that is not overloading

____________________________________________________________

Wrapper Classes

    object representation of primitive datatypes

    these are classes in the java.lang package

    primitive types --> wrapper classes

    byte        --> Byte
    short        --> Short
    int         --> Integer
    long          --> Long
    float        --> Float
    double        --> Double
    boolean        --> Boolean
    char        --> Character

How to create Wrapper class objects

    1) className varName = new className(value); <-- deprecated: not supported for future

    2) className varName = value; <-- way to use

Why/where do we use them

    1) ArrayList and other collections do not work with primitive datatypes

        --> Array objects can work with primitive and object types

    2) Wrapper classes have some useful methods & information

What is Autoboxing and Unboxing

    Autoboxing: converts the primitive datatype to the wrapper class object

    Unboxing: converts the wrapper class object to a primitive datatype

Character methods:

    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number

Parse methods:

    converts a String to a specific primitive type

    Integer.parseInt()
        accepts a String and converts it to a int type

    Double.parseDouble()

Note: the String must have valid numbers only

    valueOf() --> convert the parameter to the objects

    conclusion: parse and value methods do similar action -- converting, but the return values are different. We will most likely use parse more

The Wrapper classes have access to the MAX_VALUE and MIN_VALUE of each type

    Ex:
        Integer.MAX_VALUE --> gives the biggest possible int number

        Integer.MIN_VALUE --> gives the smallest possible int number


     */
}
