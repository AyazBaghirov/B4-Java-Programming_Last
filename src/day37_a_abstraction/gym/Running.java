package day37_a_abstraction.gym;

public class Running extends Exercise {

    //String name;

    public Running(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void doExercise() {
        System.out.println("Running " + name);
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("Burning calories for " + minutes + " minutes while running");
    }

    @Override
    public int calculateCaloriesBurned(int minutes){
        return  minutes * 10;
    }
}