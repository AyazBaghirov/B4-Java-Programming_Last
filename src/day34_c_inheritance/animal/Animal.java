package day34_c_inheritance.animal;
// Animal is the parent class which inherits all accessible instance members to Child classes
public class Animal {
    // Instance variables
    String type;
    int numOfLegs;
    private int age;

    // Instance Method
    public void walk(){
        System.out.println(type + " is walking");
    }




}
