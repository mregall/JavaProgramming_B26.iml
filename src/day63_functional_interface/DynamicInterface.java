package day63_functional_interface;

@FunctionalInterface
public interface DynamicInterface<T> {

    void test(T t);  //T is just the conventional generic "T" for type
}
