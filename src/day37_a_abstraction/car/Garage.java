package day37_a_abstraction.car;

public class Garage {
    public static void main(String[] args) {

        // We canNOT create object of abstract class
        //Car car = new Car();
        //car.start();

        Toyota toyota = new Toyota();
        toyota.start();


        Honda honda = new Honda();
        honda.start();


        System.out.println();
        // We canNOT create object of abstract class
        //ElectricCar obj1 = new ElectricCar();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();




    }
}