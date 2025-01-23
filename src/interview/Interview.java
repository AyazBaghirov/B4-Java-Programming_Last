package interview;

public class Interview {
    public static void main(String[] args) {
       // System.out.println(interview());
        System.out.println(addition());
        interview();
       int a =  addition();
        System.out.println(a);
    }
    public static void interview() {
        int sum = 5+5;
        System.out.println("Printing from void method");

    }
    public static int addition(){
        int sum =5+5;
        System.out.println("Printing from return method");
        return sum;
    }
}
