package day38_b_polymorphism.animal;

public class Lizard extends Reptile {

    //String name;
    String skinColor;

    @Override
    public void eat() {
        System.out.println("Lizard eating....");
    }

}