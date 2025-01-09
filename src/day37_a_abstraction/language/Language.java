package day37_a_abstraction.language;

public interface Language {

    // By default it is 'public static final'
    String PLANET = "Earth";

    // By default these are 'public abstract'
    void sayHello();
    void sayGoodbye();

    // default method
    public default void sayBye() {

    }

    // static method - since we have static variable, it is possible to have a static method using that static variable
    public static void sayHelloStatic() {

    }
}