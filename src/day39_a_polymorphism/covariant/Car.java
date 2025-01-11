package day39_a_polymorphism.covariant;

import day35_inheritance.super_paranthesis.D;

public class Car {
}

class BNW extends Car {}

class Tesla extends Car {}

class Toyota extends Car {}

class Camry extends Toyota {}

class LandRover extends Car { }

class Honda {}


class DealerShip {
    // Car car = new Car();
    // Car car = new Tesla();       // UPCASTING - implicitly (automatically)
    // Car car = new LandRover();   // UPCASTING - implicitly (automatically)
    // Car car = new Toyota();      // UPCASTING - implicitly (automatically)
    // Car car = new Camry();       // UPCASTING - implicitly (automatically)
    public static void leas (Car car) {
        System.out.println("Leasing a car: " + car.getClass().getName());
    }

    public static Car getCar (int option) {

        if (option == 1) {
            return new Toyota();
        } else if (option == 2) {
            return new Camry();
        } //else if (option == 3) {
        // return new Honda(); // Honda does not have IS-A relation with Car class
        //}
        else {
            return new Car();
        }

    }

    public Car checkCar (int option) {
        if (option == 1) {
            return new Toyota();
        } else {
            return new Car();
        }
    }

}

class LocationA extends DealerShip {

    //@Override - even-though it ahs SAME METHOD SIGNATURE - we canNOT override static method
    public static Car getCar (int option) {
        if (option == 1) {
            return new Toyota();
        } else {
            return new Car();
        }
    }

    // COVARIANT - overridden method in child class, can return same thing as the one in Parent class or any Child class of the Return Parent class
    @Override
    public Toyota checkCar (int option) {
        if (option == 1) {
            return new Toyota();
        } else {
            return (Toyota) new Car(); // DOWNCASTED
        }
    }

}



class Runner {
    public static void main(String[] args) {

        Car car = new Car();
        DealerShip.leas(car);

        Tesla tesla = new Tesla();
        DealerShip.leas(tesla);

        DealerShip.leas(new LandRover());
        DealerShip.leas(new Toyota());
        DealerShip.leas(new Camry());


        System.out.println("--------------------------------------------------");

        Car car1 = DealerShip.getCar(1);
        // Toyota car2 = DealerShip.getCar(1); // Cannot assign bigger datatype into smaller without implicit down-casting
        // DealerShip.getCar(1); --- > Car car = new Toyota();
        // Toyota car2  = Car car
        Toyota car3 = (Toyota) DealerShip.getCar(1);

        LocationA.getCar(1);


    }
}
