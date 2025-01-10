package day38_a_abstraction_interface.relation;

import day38_a_abstraction_interface.shopping.Shipping;

// Going from interface to interface is still INHERITANCE. So we use 'extends'
// Interface can extends multiple interfaces
public interface ConsumerApp extends AllowUserToSell, Shipping {


}

// Going from interface to class (is the one get additional info from interface), we use 'implements'
abstract class Test implements AllowUserToSell, Shipping {

}

abstract class Test2 extends Test {

}

class Runner {
    public static void main(String[] args) {


    }
}