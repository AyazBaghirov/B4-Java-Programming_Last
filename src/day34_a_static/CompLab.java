package day34_a_static;
// Runner Class - main()
public class CompLab {

    public static void main(String[] args) {

        // Computer comp1 = new Computer(); // this is trying to call a non-parameterized constructor / default constructor

        Computer comp1 = new Computer("Dell", "Black", 999.90);
        System.out.println(comp1);


        Computer comp2 = new Computer("HP", "Silver", 599.90);
        System.out.println(comp2);

        System.out.println();
        System.out.println(Computer.hasScreen); // Use the class name to reach/use the static members
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);

        System.out.println(comp1.hasScreen); // static member can be reached by object reference but not preferable
        System.out.println(comp2.hasScreen); // static member can be reached by object reference but not preferable


        System.out.println();
        comp1.price = 299.90;
        System.out.println(comp1.price);
        System.out.println(comp2.price); // this will not change - each object has its own copy of instance member

        System.out.println(comp1);
        System.out.println(comp2);

        System.out.println();
        comp1.hasScreen = true; // not preferable to use object reference for static members. - instead use the Class name

        System.out.println(comp1.hasScreen);
        System.out.println(comp2.hasScreen); // this will change - each object shares the SAME copy of static members

        System.out.println(comp1);
        System.out.println(comp2);
    }

}
