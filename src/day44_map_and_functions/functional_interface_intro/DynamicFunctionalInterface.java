package day44_map_and_functions.functional_interface_intro;
//<E> - Generic - meaning that you can use ANY OBJECT DATA type
// T is another name that can be sued as well
// FunctionalInterface - has to have ONLY 1 abstract method.

@FunctionalInterface
public interface DynamicFunctionalInterface <T> {
    void test (T t);
}