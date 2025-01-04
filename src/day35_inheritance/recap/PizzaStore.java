package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Large", 5);
        // pizza1.size = "Big"; // Since encapsulation applied, cannot access directly.
        // pizza1.numOfToppings = -4;
        pizza1.setSize("Very Big");
        System.out.println(pizza1);


        Pizza pizza2 = new Pizza("small", 2);
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza("medium", 3);
        System.out.println(pizza3);


    }
}