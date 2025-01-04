package day36_inheritance.static_hide;

public class A {

    public void instanceMethod(){
        System.out.println("An instance method is running from PARENT class!");
        staticMethod(); // instance accepts BOTH - static and instance
    }

    public static void staticMethod(){
        System.out.println("A static method is running from PARENT class!");
        //instanceMethod();  // static ONLY ACCEPTS static
    }
}
