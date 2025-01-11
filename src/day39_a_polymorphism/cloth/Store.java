package day39_a_polymorphism.cloth;

import day37_a_abstraction.language.Language;

public class Store {
    public static void main(String[] args) {

        // All possible references of TShirt
        // 1 - Itself
        TShirt t1 = new TShirt();
        t1.wearClothes();

        // 2 - Parent Class
        Clothes t2 = new TShirt();
        t2.wearClothes();

        // 3 - Object
        Object t3 = new TShirt();


        System.out.println("-----------------------------");

        // All possible references of Jacket
        // 1- Itself
        Jacket j1 = new Jacket();
        j1.wearClothes();
        j1.putOnHood();


        // 2 - Parent class
        Clothes j2 = new Jacket();
        j2.wearClothes();
        // j2.putOnHood(); // Reference side (Clothes) does not have access to putOnHood(); method


        // 3 - Interface (which is implemented by Jacket class)
        // Language j9 = new Jacket(); // Since no relation is there, it canNOT be reference side
        HasHood j3 = new Jacket();
        j3.putOnHood();
        // j3.wearClothes(); // Reference side (HasHood) does not have access to wearClothes(); method


        // 4 - Object class - parent of all classes
        Object j4 = new Jacket();
        // j4.wearClothes(); // Reference side (Object) does not have access to wearClothes(); method
        // j4.putOnHood(); // // Reference side (Object) does not have access to putOnHood(); method


        System.out.println("***************************");
        TShirt tShirt = new TShirt();
        // Possible References: itself + parent
        buy(tShirt);
        //buy(new TShirt());

        Jacket jacket = new Jacket();
        // Possible References: itself + parent + interface
        buy(jacket);
        //buy(new Jacket());



        test(1);
        test2("Hello");
        test2(new String("Hello"));

    }

    // Clothes clothes = new TShirt();
    // Clothes clothes = new Jacket();;
    public static void buy (Clothes clothes) {

        if (clothes instanceof Clothes){
            System.out.println("Bought Clothes");
        }

        if (clothes instanceof TShirt) {
            System.out.println("Bought a TShirt");
        } else if (clothes instanceof Jacket) {
            System.out.println("Bought a Jacket");
        }

    }

    public static void test(double d) {}
    public static void test2(String s) {}

}
