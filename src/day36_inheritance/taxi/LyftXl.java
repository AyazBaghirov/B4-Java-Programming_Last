package day36_inheritance.taxi;

public class LyftXl extends Lyft {

    public LyftXl(String driverName) {
        super(driverName);
    }


    // Instance overridden method - cost will be %20 more
    @Override
    public double calculateRate (int miles){
        return super.calculateRate(miles) * 1.20;
    }


}