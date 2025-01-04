package day36_inheritance.taxi;

public class Lyft {
    //Instance variable - default | access - same package
    String driverName;

    // Constructor - NOT inherited
    public Lyft(String driverName) {
        this.driverName = driverName;
    }

    // Instance method - each mile costs $2.5
    public double calculateRate (int miles){
        return miles * 2.5;
    }






}