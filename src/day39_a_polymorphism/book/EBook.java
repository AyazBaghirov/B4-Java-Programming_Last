package day39_a_polymorphism.book;
// Child Abstract Class
public abstract class EBook extends Book implements Downloadable {
    int storageSize;
    public abstract void open();
}