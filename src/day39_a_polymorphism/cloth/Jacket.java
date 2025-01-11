package day39_a_polymorphism.cloth;
// Concrete Class
public class Jacket extends Clothes implements HasHood {
    @Override
    public void wearClothes() {
        System.out.println("Wearing Jacket...");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on Jacket's Hoody...");
    }
}
