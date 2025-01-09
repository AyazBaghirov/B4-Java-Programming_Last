package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {


        //CanNOT create object of abstract class
        //Exercise obj = new Exercise("Test");

        Running obj1 = new Running("Marathon");
        obj1.doExercise();
        obj1.burnCalories(1000);
        System.out.println(obj1.name);
        System.out.println(obj1.calculateCaloriesBurned(10));

        System.out.println();
        PullUps obj2 = new PullUps("Knees to Elbow");
        obj2.doExercise();
        obj2.burnCalories(20);
        System.out.println(obj2.name);
        System.out.println(obj2.calculateCaloriesBurned(10));



    }
}