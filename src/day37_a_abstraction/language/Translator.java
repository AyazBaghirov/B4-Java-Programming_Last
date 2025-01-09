package day37_a_abstraction.language;

import day37_a_abstraction.car.Tesla;

public class Translator {
    public static void main(String[] args) {

        // CanNOT create object of interface. Same as Abstract class
        // Language obj = new Language();

        Spanish s = new Spanish();
        s.sayHello();
        s.sayGoodbye();
        System.out.println(Spanish.PLANET);


        System.out.println();
        Turkish t = new Turkish();
        t.sayHello();
        t.sayGoodbye();
        System.out.println(Turkish.PLANET);

        // Turkish.PLANET = "Mars"; // CanNOT reassign final variables

    }
}