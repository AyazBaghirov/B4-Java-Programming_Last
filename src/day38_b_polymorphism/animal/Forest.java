package day38_b_polymorphism.animal;

public class Forest {
    public static void main(String[] args) {


        // 1 - Animal
        // Reference itself
        Animal animal = new Animal();
        //animal.eat();
        animal.name = "General Animal";
        //System.out.println(animal.name);




        // 2 - Lizard
        // 2.a - Reference is itself
        Lizard lizard1 = new Lizard();
        // What lizard1 has access
        lizard1.skinColor = "Blue";
        lizard1.eat();
        lizard1.numOfLegs = 10;
        lizard1.name = "Lizard";
        System.out.println(lizard1.skinColor);
        System.out.println(lizard1.numOfLegs);
        System.out.println(lizard1.name);



        System.out.println();
        // 2.b - Reference is parent
        Reptile lizard2 = new Lizard();
        // What lizard2 has access
        // lizard2.skinColor = "Blue"; // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        lizard2.eat(); // If Reptile class and its Parent Animal do not have eac() method, there Reptile class does not have access to eact();
        lizard2.numOfLegs = 10;
        lizard2.name = "Lizard";
        // System.out.println(lizard2.skinColor); // // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        System.out.println(lizard2.numOfLegs);
        System.out.println(lizard2.name);



        System.out.println();
        // 2.c - Reference is grandparent
        Animal lizard3 = new Lizard();
        // What lizard3 has access
        // lizard3.skinColor = "Blue"; // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        lizard3.eat();
        //lizard3.numOfLegs = 10; // Since reference decides what is accessible, numOfLegs not being in Reference class gives an error
        lizard3.name = "Lizard";
        //System.out.println(lizard3.skinColor); // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        //System.out.println(lizard3.numOfLegs);  // Since reference decides what is accessible, numOfLegs not being in Reference class gives an error
        System.out.println(lizard3.name);


        System.out.println();
        // 3 - Reptile
        // 3.a - Reference itself
        Reptile reptile1 = new Reptile();
        // What reptile1 has access
        // reptile1.skinColor = "Blue"; // Parent reference & object does not have access anything from child
        reptile1.eat();
        reptile1.numOfLegs = 10;
        reptile1.name = "Reptile";
        // System.out.println(reptile1.skinColor); // Parent reference & object does not have access anything from child
        System.out.println(reptile1.numOfLegs);
        System.out.println(reptile1.name);


        System.out.println();
        // 3.b - Reference parent
        Animal reptile2 = new Reptile();
        // What reptile2 has access
        // reptile2.skinColor = "Blue"; // Parent reference & child object does not have access anything from grand child
        reptile2.eat();
        // reptile2.numOfLegs = 10; // Parent reference & object does not have access anything from child
        reptile2.name = "Reptile";
        // System.out.println(reptile2.skinColor); // Parent reference & object does not have access anything from child
        // System.out.println(reptile2.numOfLegs); // // Parent reference & object does not have access anything from child
        System.out.println(reptile2.name);


    }
}
