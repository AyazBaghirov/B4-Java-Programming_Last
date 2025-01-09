package day37_a_abstraction.book;

// interface - is another way of achieving ABSTRACTION
public interface Create {

    // variables -> by default it is 'public static final' - CONSTANT - has to be initialized
    // public static final String NAME = "Java";
    String NAME = "Java";  // same as above but no need to declare 'public static final'

    // methods with 'return type and name and () -> by default it is 'public abstract'
    // public abstract void read();
    void read();  // same as above but no need to declare 'public abstract'

    void write();
}
