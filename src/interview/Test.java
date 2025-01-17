package interview;

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.methodA();
    }
}

class A {
protected void methodA(){
    System.out.println("methodA");
}
}
class B extends A {

    public void methodA() {
        System.out.println("methodC");
    }
}