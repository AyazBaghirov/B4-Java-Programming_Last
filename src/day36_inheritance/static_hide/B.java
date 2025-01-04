package day36_inheritance.static_hide;

public class B extends A {

    @Override // Override instance method in child class
    public void instanceMethod(){
        System.out.println("An instance method is running from CHILD class!");
        staticMethod();
    }

    //@Override // static methods do NOT get overridden. It hides the one from PARENT
    public static void staticMethod(){
        System.out.println("A static method is running from CHILD class!");
    }



}