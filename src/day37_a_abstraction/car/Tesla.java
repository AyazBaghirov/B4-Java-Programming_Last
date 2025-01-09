package day37_a_abstraction.car;
// CONCRETE CLASS / NON-ABSTRACT CLASS
public class Tesla extends ElectricCar {


    @Override
    public void start() {
        System.out.println("Tesla is starting by phone");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}