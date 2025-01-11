package day39_a_polymorphism.book;
// Concrete Class
public class JavaTextBook extends EBook {
    // You can have any other members specific to this class: instance members, static members, constructor
    boolean isFUn;

    @Override
    public void open() {
        System.out.println("Openning Java text book...");
    }
    @Override
    public void read() {
        System.out.println("Reading Java text book...");
    }
    @Override
    public void download() {
        System.out.println("Downloading Java text book...");
    }
}