package day44_map_and_functions.functional_interface_intro;

public class UsingNumberInterface {
    public static void main(String[] args) {

        // Lambda expression ------->     ()->{}
        NumberInterface evenOrOdd = (num) -> {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        };

        evenOrOdd.apply(5);
        evenOrOdd.apply(10);

        System.out.println("-----------------------------");

        // Lambda expression ------->     ()->{}
        NumberInterface calculateCube = (num) -> {
            System.out.println("Cube for " + num + " is " + num * num * num);
        };

        // if we have one argument - we do NOT need to use ()
        //NumberInterface calculateCube = num -> {
        //    System.out.println("Cube for " + num + " is " + num * num * num);
        //};

        // if we have one argument - we do NOT need to use ()
        // if you have one statement inside lambda expression body {}, we do NOT need to use {}
        //NumberInterface calculateCube = num ->
        //    System.out.println("Cube for " + num + " is " + num * num * num);


        calculateCube.apply(5);
        calculateCube.apply(3);



        System.out.println("-----------------------------");
        A a = new A();
        a.apply(20);

        B b = new B();
        b.apply(4);


    }
}