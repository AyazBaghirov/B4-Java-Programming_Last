package day34_a_static;
// Template class - define the instruction/set of rules how each object and class will behave

/*
    Computer - static

    class name: Computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */
public class Computer {

    // Instance variables - each object has its own set of copy
    String brand;
    String color;
    double price;


    // Static variables - each object shares the same copy
    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;


    // Static Block - initializer for static variables
    // It loads/runs only one time - when the class FIRST called
    static {
        System.out.println("Running static block");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
        // price = 34.99; // static accepts only static
    }


    // Constructor - initializer for instance variables
    public Computer(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    // It is a special method which helps to print the info about the object directly.
    // Instance method.
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasScreen=" + hasScreen +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                '}';
    }
}
