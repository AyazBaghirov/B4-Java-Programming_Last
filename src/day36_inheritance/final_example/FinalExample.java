package day36_inheritance.final_example;

import day36_inheritance.app.Instagram;

public class FinalExample {
    // Instance variables
    // final int z; // If something is final, it has to have an initial value either directly or through constructor
    final int a = 5; // Since it is final and had initial value
    final int b; // Since it is final and initial value is given through constructor, this is ok


    // Static variables
    // static final double PI;  // this never got initialized, so NOT ok
    public static final String PLANET = "Earth"; // this is initialized directly, so it is ok
    public static final int NUMBER_OF_EARTH_PLANET; // this is initialized in static block, so it is ok

    // If a variable is 'static final' it is called "CONSTANT VARIABLES"

    // Some CONSTANT VARIABLE samples
    // Integer.MAX_VALUE;
    // Math.PI

    public FinalExample(int b) {
        this.b = b;
    }

    static {
        NUMBER_OF_EARTH_PLANET = 1;
    }


}