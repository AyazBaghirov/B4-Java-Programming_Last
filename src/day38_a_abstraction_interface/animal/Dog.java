package day38_a_abstraction_interface.animal;
// Concrete Class / Non-Abstract Class
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dogs eat from bowl");
    }
}