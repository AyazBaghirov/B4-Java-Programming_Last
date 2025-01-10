package day38_a_abstraction_interface.shopping;
//Concrete Class
public class Amazon extends OnlineShopping  {
    @Override
    public void deliveryEstimate() {
        System.out.println("Amazon delivery estimate");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy an amazon item");
    }

    @Override
    public void returnItem() {
        System.out.println("Return an amazon item");
    }

    @Override
    public void shippingCost(boolean hasMembership) {
        System.out.println( hasMembership ? "has membership, not shipping cost" : "has no membership, shipping cost will be added");
    }
}
