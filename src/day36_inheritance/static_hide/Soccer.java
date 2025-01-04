package day36_inheritance.static_hide;

public class Soccer extends Sports{

    // @Override - static method do NOT get overridden
    // the method from Parent class get HIDDEN (Hiding the on from Parent class)
    public static void play(){
        System.out.println("Sports is playing from Child Class!");
    }

    /*
        If we have exact same method declared in CHILD class
            - the one from Parent is inherited but gets Hidden by the on in Child class
            - Child class object will call the method Child class

        If we do not have exact same method declared in the CHILD class
            - the on from Parent is inherited
            - Child class object will call the method from PARENT class that was inherited.
     */


}