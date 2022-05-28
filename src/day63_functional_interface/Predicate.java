package day63_functional_interface;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

}
