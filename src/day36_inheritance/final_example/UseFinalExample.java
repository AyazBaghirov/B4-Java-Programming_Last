package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {
        FinalExample obj1 = new FinalExample(10);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(FinalExample.PLANET);
        System.out.println(FinalExample.NUMBER_OF_EARTH_PLANET);
        System.out.println("After trying to re-assign values.");
        //obj1.a = 10; // since 'a' is final, we canNOT change value
        //FinalExample.PLANET = "Mars"; // since 'PLANET' is final, we canNOT change value
        // FinalExample.NUMBER_OF_EARTH_PLANET = 2; //Since it is final, we canNOT change value


        System.out.println("----------------------");
        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj1.PLANET);
        System.out.println(obj2.PLANET);

        // obj2.PLANET = "Mars"; // Still, since it is final, we canNOT change the value
    }
}