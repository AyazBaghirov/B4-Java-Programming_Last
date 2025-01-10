package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {


        // Abstract class canNOT be instantiated/no object can be created
        //Shopping s = new Shopping();
        //OnlineShopping os = new OnlineShopping();
        // Interface canNOT be instantiated/no object can be created
        //Shipping sh = new Shipping();

        // Can I create object of Target class
        Target t = new Target();
        t.buyItem();
        t.returnItem();
        System.out.println(t.price);

        System.out.println("---------------------");
        //Can I create object of Amazon class
        Amazon a = new Amazon();
        //System.out.println(a.COUNTRY); // Not good practice to reach static member with object reference
        System.out.println(Amazon.COUNTRY);
        a.deliveryEstimate();
        a.buyItem();
        a.returnItem();
        a.shippingCost(true);
        System.out.println(a.price);

        System.out.println("---------------------");
        System.out.println(Shipping.COUNTRY);
        System.out.println(Amazon.COUNTRY);
        System.out.println(OnlineShopping.COUNTRY);


    }
}