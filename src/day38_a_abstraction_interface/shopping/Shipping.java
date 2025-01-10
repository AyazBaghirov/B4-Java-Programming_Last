package day38_a_abstraction_interface.shopping;

public interface Shipping {
    // everything is 'public
    // variables are by default: 'public static final
    // CONSTANT variable -> public static final
    String COUNTRY = "USA";

    //by default -- > public abstract
    void shippingCost(boolean hasMembership);

}