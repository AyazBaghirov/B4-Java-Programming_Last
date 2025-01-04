package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {

        Lyft l = new Lyft("Feyruz");
        System.out.println("Cost: $" + l.calculateRate(10));


        LyftXl xl = new LyftXl("Tom");
        System.out.println("Cost: $" + xl.calculateRate(10));

        /*
            xl - access
                    - driverName
                    - calculataRate() -- from parent / override with different implementation
         */
    }
}
