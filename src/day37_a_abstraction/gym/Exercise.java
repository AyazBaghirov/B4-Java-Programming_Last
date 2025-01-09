package day37_a_abstraction.gym;

public abstract class Exercise {

    // In Abstract class - we still can have all the other members as regular class
    // Instance variable
    String name;

    // Constructor
    public Exercise(String name) {
        this.name = name;
    }

    //ABSTRACT METHOD - method without body
    public abstract void doExercise();

    //ABSTRACT METHOD - method without body
    public abstract void burnCalories(int minutes);

    //ABSTRACT METHOD - method without body
    public abstract int calculateCaloriesBurned(int minutes);
}