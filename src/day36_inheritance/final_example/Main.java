package day36_inheritance.final_example;
public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.walk();

        Child c = new Child();
        c.walk();

    }



}

class Parent {

    // Instance method
    public final void walk () {
        System.out.println( "Walking ... from parent class");
    }
    // final method - cannot be overridden in CHILD class. We restrict all the CHILD class to override this specific method.
    // It is possible that, I want to FORCE all my child class to use EXACT same implementation from PARENT


    // We still can OVERLOAD final method
    public final void walk (int a) {
        System.out.println( "Walking ... from parent class");
    }

    // We still can OVERLOAD final method
    public void walk (double a) {
        System.out.println( "Walking ... from parent class");
    }

}

class Child extends Parent {

    //Instance method
    //@Override
    //public void walk () {
    //    System.out.println( "Walking ... from child class");
    //}

    @Override
    public void walk (double a) {
        System.out.println( "Walking ... from child class");
    }
}


class A {

}

class B extends A {

}

final class C extends B{

}
// Since class C is final class, it canNOT have any child class / canNOT be inherited

class D extends B {

}

class E extends D {

}
