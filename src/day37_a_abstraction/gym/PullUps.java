package day37_a_abstraction.gym;

public class PullUps extends Exercise{

    //String name;

    public PullUps(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void doExercise() {
        System.out.println("Doing " + name + " pull ups.");
    }

    @Override
    public void burnCalories(int minutes) {
        System.out.println("Burning calories for " + minutes + " minutes while doing pull ups");
    }

    @Override
    public int calculateCaloriesBurned(int minutes){
        return minutes * 5;
    }
}
